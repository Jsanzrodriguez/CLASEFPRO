public enum MesesAnio {
    Enero("Invierno",1,31), Febrero("Invierno",2,28), Marzo("Primavera",3,31),
    Noviembre("Otoño",11,30), Diciembre("Invierno",12,31);


    int numeroMes;
    String estacion;
    int diasMes;


    //Me vale para construir los enum de MeseAnio
    MesesAnio(String estacionP, int numeroMesP, int diaMesP){
        estacion = estacionP;
        numeroMes = numeroMesP;
        diasMes = diaMesP;


    }
}
