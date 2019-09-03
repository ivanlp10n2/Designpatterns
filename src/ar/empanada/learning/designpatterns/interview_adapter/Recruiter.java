package ar.empanada.learning.designpatterns.interview_adapter;

public class Recruiter {

    Adapter adapterCandidatoACandidatoPiola;
    public void entrevistarCandidatoFacha(){

        CandidatoInterface candidatoInterface = new Candidato();
        candidatoInterface.cocinar(); //You need this method but your interface is of differnte type;

        adapterCandidatoACandidatoPiola = new CandidatoMakeUpAdapter(new Candidato());
        adapterCandidatoACandidatoPiola.adapterCocinar(); //cooking piola


    }


}
