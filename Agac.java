package treesbinary;
@author Onur Akbal
//////////////////// Onur Akbal Tarafindan kodlanmistir. ////////////////////

public class Agac {
    Dugum kok;
    public Agac(){

        kok=null;
    }
     

    // Dolu dugum Sayisi Bulan Fonksiyon (iki cocugu olan dugum Dolu dugumdur.)
    int doluDugumSayisi=0;
    int DoluDugumHesapla_preOrder(Dugum d){
        
        if(d.icerik==kok.icerik){    // Eger DoluDugumHesapla_preOrder fonksiyonunu yeniden kullandiginda 
          doluDugumSayisi=0;         // Dolu Dugum sayisi sifirlaniyor.     
            
        }
            
        System.out.print(" |  "+d.icerik+" ");
        if(d.sol != null && d.sag !=null)  //Dolu Dugum bulma durumu
        {
            doluDugumSayisi++;
        }
        if(d.sol!=null){
            DoluDugumHesapla_preOrder(d.sol);   //preordersol gezinti
        }
        if(d.sag!=null){
            DoluDugumHesapla_preOrder(d.sag);   //preordersag gezinti
        }
        
        return doluDugumSayisi;
          
        
        
        
    }
   // Agac yapisinin Ikili Arama Agacimi Degilmi Kontrol Fonksiyonu
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
