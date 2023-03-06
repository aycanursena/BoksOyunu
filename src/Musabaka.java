public class Musabaka {
    Boksor b1;
    Boksor b2;
    int minAgirlik;
    int maxAgirlik;

    Musabaka(Boksor b1, Boksor b2, int minAgirlik, int maxAgirlik){
        this.b1 = b1;
        this.b2 = b2;
        this.minAgirlik = minAgirlik;
        this.maxAgirlik = maxAgirlik;
    }
    public  void Basla(){
        if (isKontrol()){
            while (this.b1.can > 0 && this.b2.can > 0){
                System.out.println("----- YENİ ROUND -----");
                this.b2.can = this.b1.Vurma(this.b2);
                if (isWin()){
                    break;
                }
                this.b1.can = this.b2.Vurma(this.b1);
                if (isWin()){
                    break;
                }

                System.out.println(this.b1.name + " kalan can : " + this.b1.can);
                System.out.println(this.b2.name + " kalan can : " + this.b2.can);
            }
        }
        // (else) -> isKontrol false ise çalışır.
        else
            System.out.println("Sporcuların sikletleri uymuyor.!");
    }
    public boolean isKontrol(){
        return (this.b1.agirlik >= minAgirlik && this.b1.agirlik <= maxAgirlik) && (this.b2.agirlik >= minAgirlik && this.b2.agirlik <= maxAgirlik);
    }

    public boolean isWin(){
        if (this.b1.can == 0){
            System.out.println(this.b2.name + " kazandı !");
            return true;
        }if (this.b2.can == 0) {
            System.out.println(this.b1.name + " kazandı !");
            return true;
        }
        return false;
    }
}
