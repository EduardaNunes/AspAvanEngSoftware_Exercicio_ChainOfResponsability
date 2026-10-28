package chainofresponsability;

import org.example.chainofresponsability.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AprovacaoDespesaTest {

    Supervisor supervisor;

    @BeforeEach
    void setUp() {
        CEO ceo = new CEO();
        Diretor diretor = new Diretor(ceo);
        Gerente gerente = new Gerente(diretor);
        supervisor = new Supervisor(gerente);
    }

    @Test
    void deveAprovarComSupervisor() {
        assertEquals("Supervisor", supervisor.aprovarDespesa(new SolicitacaoDespesa(300.0f, "Material de escritório")));
    }

    @Test
    void deveAprovarComSupervisorNoLimiteExato() {
        assertEquals("Supervisor", supervisor.aprovarDespesa(new SolicitacaoDespesa(500.0f, "Limite exato")));
    }

    @Test
    void deveAprovarComGerente() {
        assertEquals("Gerente", supervisor.aprovarDespesa(new SolicitacaoDespesa(1000.0f, "Equipamento")));
    }

    @Test
    void deveAprovarComGerenteNoLimiteExato() {
        assertEquals("Gerente", supervisor.aprovarDespesa(new SolicitacaoDespesa(5000.0f, "Limite exato gerente")));
    }

    @Test
    void deveAprovarComDiretor() {
        assertEquals("Diretor", supervisor.aprovarDespesa(new SolicitacaoDespesa(10000.0f, "Viagem")));
    }

    @Test
    void deveAprovarComCEO() {
        assertEquals("CEO", supervisor.aprovarDespesa(new SolicitacaoDespesa(100000.0f, "Aquisição")));
    }

    @Test
    void deveRetornarSemAprovacaoQuandoNinguemNaCadeiaTemAlcada() {
        Diretor diretorSemSuperior = new Diretor(null);
        Gerente gerenteSemCEO = new Gerente(diretorSemSuperior);
        Supervisor supervisorSemCEO = new Supervisor(gerenteSemCEO);
        assertEquals("Sem aprovação", supervisorSemCEO.aprovarDespesa(new SolicitacaoDespesa(999999.0f, "Acima de tudo")));
    }

}