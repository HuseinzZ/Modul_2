package OCP;

public class CinemaCalculations {
    public double calculateAdminFee(Cinema cinema){
        if (cinema instanceof StandardCinema){
            return ((StandardCinema) cinema).price * 10 /100;
        }
        else if (cinema instanceof DeluxeCinema){
            return ((DeluxeCinema) cinema).price * 12 /100;
        }
        else if (cinema instanceof PremiumCinema){
            return ((PremiumCinema) cinema).price * 20 /100;
        }
        else {
            return 0.0;
        }
    }
}
