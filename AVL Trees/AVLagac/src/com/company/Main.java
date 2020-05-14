package com.company;

// @author Onur Akbal

public class Main {

    public static void main(String[] args) {
        AVLTree agac = new AVLTree();

        agac.kok = agac.ekle(agac.kok, 12);
        agac.kok = agac.ekle(agac.kok, 21);
        agac.kok = agac.ekle(agac.kok, 33);
        agac.kok = agac.ekle(agac.kok, 45);
        agac.kok = agac.ekle(agac.kok, 56);
        agac.kok = agac.ekle(agac.kok, 27);

        /* ilk bastaki AVL Agaci

             33
            /  \
          21   45
         /  \     \
        12  27    56

        */

        System.out.println("PreOrder dolasma ile AVL Agac yapisi :");
        agac.preOrder(agac.kok);
        System.out.println("\n");

        System.out.println("Agac Yapisina `5` ve `4` elemanlari eklendi\n");


        agac.kok = agac.ekle(agac.kok, 5);

        agac.kok = agac.ekle(agac.kok, 4);    // EN SOL TARAFA IKI ELEMAN EKLEYEREK DENGEYI BOZUYORUZ.


        System.out.println("\nPreOrder dolasma ile AVL Agac yapisi :");
        agac.preOrder(agac.kok);
        System.out.println("\n");
        /* Sonraki Rotate isleminden sonra bu hali alacaktir
        Dengeli haldedir.

               33
              /  \
            21   45
           /  \     \
          5   27    56
         /  \
        4   12

        */

    }
}

