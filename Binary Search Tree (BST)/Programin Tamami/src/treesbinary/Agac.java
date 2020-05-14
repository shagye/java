package treesbinary;

public class Agac {
    Dugum kok;
    public Agac(){
        kok=null;
    }
     

    
    void duzensizEkle(Dugum d,Dugum eklenecek){
        
        if(d.sol!=null){     //agac veri yapisinin en sol ucu(yapragi)'na git 
            duzensizEkle(d.sol,eklenecek);
        }
        else if(d.sol==null){
            d.sol=eklenecek;
        }
       
       
    }
    void ekle(Dugum yeni){
		
        Dugum y = null;
        Dugum x = kok;
        
        while(x!=null){
            y = x ;
            if(yeni.icerik < x.icerik){
                x = x.sol;
            }
            else {
                x = x.sag;
            }
        }
        
        if(y==null){
            kok = yeni ;
        }
        
        // Sonrasında bulduğumuz konumda eğer küçükse soluna büyükse sağına ekliyoruz.
        else if(yeni.icerik < y.icerik){
            y.sol = yeni ;
        }
        else y.sag = yeni;
    }
    
      Dugum Min(){
        Dugum sonuc = kok;
        while(sonuc.sol!=null){
            sonuc= sonuc.sol;
        }
        return sonuc;
    }
   
      
    int doluDugumSayisi=0;
    int DoluDugumHesapla_preOrder(Dugum d){
        
        if(d.icerik==kok.icerik){    // Eger DoluDugumHesapla_preOrder fonksiyonunu yeniden kullandiginda 
          doluDugumSayisi=0;         // Dolu Dugum sayisi sifirlaniyor.     
            
        }
            
        System.out.print(" |  "+d.icerik+" ");
        if(d.sol != null && d.sag !=null)
        {
            doluDugumSayisi++;
        }
        if(d.sol!=null){
            DoluDugumHesapla_preOrder(d.sol);
        }
        if(d.sag!=null){
            DoluDugumHesapla_preOrder(d.sag);
        }
        
        return doluDugumSayisi;
          
        
        
        
    }
   
    boolean BinaryST_Kontrol(Dugum kok){
        if(kok==null)
        {
            return true;
        }
        
        if(kok.sol != null && kok.icerik<=kok.sol.icerik)
        {
            return false;
        }
        if(kok.sag != null && kok.icerik >= kok.sag.icerik)
        {
            return false;
        }
        return (BinaryST_Kontrol(kok.sol) && BinaryST_Kontrol(kok.sag) );
        
    }
}
