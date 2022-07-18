public class RodarAplicacao {

    public static void  main(String[] args){

        Carro carro1 = new Carro();

        carro1.setCor("Preto");
        carro1.setModelo("BMW Serie 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque());

        Carro carro2 = new Carro();

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque());

    }
}
