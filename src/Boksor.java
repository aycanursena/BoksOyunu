public class Boksor {
    String name;
    int damage;
    int can;
    int agirlik;
    int dodge;
    Boksor(String name, int damage, int can, int agirlik, int dodge){
        this.name = name;
        this.damage = damage;
        this.can = can;
        this.agirlik = agirlik;
        if (dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }else
            this.dodge = 0;
    }
    int Vurma(Boksor rakip){
        System.out.println(this.name + " => " + rakip.name + " " + this.damage + " " + " hasar vurdu.");
        if (rakip.isDodge()){
            System.out.println(rakip.name + " gelen hasarı blokladı!");
            System.out.println("------------------------------------");
            return rakip.can;
        } if (rakip.can - this.damage < 0){
            return 0;
        }
        return rakip.can - this.damage;
    }
    public boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
