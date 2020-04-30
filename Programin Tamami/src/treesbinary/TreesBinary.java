package treesbinary;

public class TreesBinary {
    
    public static void main(String[] args) {
        Dugum dugum1= new Dugum(8);
        Dugum dugum2= new Dugum(4);
        Dugum dugum3= new Dugum(2);
        Dugum dugum4= new Dugum(6);
        Dugum dugum5= new Dugum(1);
        Dugum dugum6= new Dugum(12);
        Dugum dugum7= new Dugum(10);
        
        Agac binaryTree = new Agac();
        
        
        binaryTree.ekle(dugum1);
        binaryTree.ekle(dugum2);
        binaryTree.ekle(dugum3);
        binaryTree.ekle(dugum4);
        binaryTree.ekle(dugum5);
        binaryTree.ekle(dugum6);
        binaryTree.ekle(dugum7);
        
        
        
        System.out.println("_____________________________________________________\n");
        System.out.println("Ikili arama agaci olan Agac Yapisi\n--Preorder Gezinti ile Elemanlarin Yazdirilmis Hali--\n");
        
        System.out.println("\n\nDolu Dugum Sayisi : "+binaryTree.DoluDugumHesapla_preOrder(binaryTree.kok));
        
        System.out.println("Ikili arama agaci ="+ binaryTree.BinaryST_Kontrol(binaryTree.kok));
        System.out.println("_____________________________________________________\n");
        System.out.println("Ikili arama agaci olmayan Agac Yapisi");
        System.out.println("--Preorder Gezinti ile Elemanlarin Yazdirilmis Hali--\n");
        
        binaryTree.duzensizEkle(binaryTree.kok,dugum7); // Dugumun en kucuk elemaninin soluna dugum7 eklendi icerigi "10" dur.
        // Yukarida duzensiz ekle fonksiyonu ile ilk parametre kok ,ikinci parametre eklenecek Dugum olmaktadir. Bu fonksiyon
        // Eklenecek elemani var olan agacin agac yapisinin en solundaki yapragin sol ucuna eklemektedir.
        
        
        System.out.println("\n\nDolu Dugum Sayisi : "+binaryTree.DoluDugumHesapla_preOrder(binaryTree.kok));
        System.out.println("Ikili arama agaci ="+ binaryTree.BinaryST_Kontrol(binaryTree.kok));
        
    }
    
}
