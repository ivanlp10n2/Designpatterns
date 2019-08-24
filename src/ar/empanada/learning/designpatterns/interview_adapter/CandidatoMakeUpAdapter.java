package ar.empanada.learning.designpatterns.interview_adapter;

public class CandidatoMakeUpAdapter implements Adapter{

    Candidato candidato;

    public CandidatoMakeUpAdapter(Candidato c){
        this.candidato = c;
    }

    @Override
    public void adapterCocinar() {
        candidato.cocinar();
    }
}
