package chainofresponsability;

import org.example.chainofresponsability.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AprovacaoDespesaTest {

    CEO ceo;
    Diretor diretor;
    Gerente gerente;
    Supervisor supervisor;

    @BeforeEach
    void setUp() {
        ceo = new CEO(null);
        diretor = new Diretor(ceo);
        gerente = new Gerente(diretor);
        supervisor = new Supervisor(gerente);
    }

    @Test
    void deveRetornarSupervisorParaAprovacaoDespesaPequena() {
        assertEquals("Supervisor", supervisor.aprovarDespesa(new SolicitacaoDespesa(TipoDespesaPequena.getTipoDespesaPequena())));
    }

    @Test
    void deveRetornarGerenteParaAprovacaoDespesaMedia() {
        assertEquals("Gerente", supervisor.aprovarDespesa(new SolicitacaoDespesa(TipoDespesaMedia.getTipoDespesaMedia())));
    }

    @Test
    void deveRetornarDiretorParaAprovacaoDespesaGrande() {
        assertEquals("Diretor", supervisor.aprovarDespesa(new SolicitacaoDespesa(TipoDespesaGrande.getTipoDespesaGrande())));
    }

    @Test
    void deveRetornarCEOParaAprovacaoDespesaExcepcional() {
        assertEquals("CEO", supervisor.aprovarDespesa(new SolicitacaoDespesa(TipoDespesaExcepcional.getTipoDespesaExcepcional())));
    }

    @Test
    void deveRetornarSemAprovacaoParaDespesaExcepcionalSemCEO() {
        Diretor diretorSemSuperior = new Diretor(null);
        Gerente gerenteSemCEO = new Gerente(diretorSemSuperior);
        Supervisor supervisorSemCEO = new Supervisor(gerenteSemCEO);
        assertEquals("Sem aprovação", supervisorSemCEO.aprovarDespesa(new SolicitacaoDespesa(TipoDespesaExcepcional.getTipoDespesaExcepcional())));
    }

    @Test
    void deveRetornarSemAprovacaoParaDespesaPessoal() {
        assertEquals("Sem aprovação", supervisor.aprovarDespesa(new SolicitacaoDespesa(TipoDespesaPessoal.getTipoDespesaPessoal())));
    }

}