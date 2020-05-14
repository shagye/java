package com.company;

public class AVLTree {
    Dugum kok;

    int boy(Dugum N) {
        if (N == null)
            return 0;

        return N.boy;
    }

    // Maksimum olani dondurme
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
    int sayac=0;
    int sayac1=0;
    int sayac2=0;
    int sayac3=0;

    Dugum rightRotate(Dugum y) {
        Dugum x = y.sol;
        Dugum T2 = x.sag;

        // Dondurme islemi
        x.sag = y;
        y.sol = T2;

        // boyu guncellemek icin
        y.boy = max(boy(y.sol), boy(y.sag)) + 1;
        x.boy = max(boy(x.sol), boy(x.sag)) + 1;


        return x;
    }

    Dugum leftRotate(Dugum x) {
        Dugum y = x.sag;
        Dugum T2 = y.sol;

        // Dondurme Islemi
        y.sol = x;
        x.sag = T2;

        //  boy guncelleme
        x.boy = max(boy(x.sol),boy(x.sag)) + 1;
        y.boy = max(boy(y.sol), boy(y.sag)) + 1;

        // dugum tipinde y yi dondur
        return y;
    }

    // Denge faktoru hesaplanmasi
    int getBalance(Dugum N) {
        if (N == null)
            return 0;

        return boy(N.sol) - boy(N.sag);
    }

    Dugum ekle(Dugum dugum, int icerik) {

        if (dugum == null)
            return (new Dugum(icerik));

        if (icerik < dugum.icerik)
            dugum.sol = ekle(dugum.sol, icerik);
        else if (icerik > dugum.icerik)
            dugum.sag = ekle(dugum.sag, icerik);
        else
            return dugum;

        dugum.boy = 1 + max(boy(dugum.sol),
                boy(dugum.sag));

        // denge kontrolu icin balance hesaplama
        int balance = getBalance(dugum);

        // Sol Sol Rotasyon
        if (balance > 1 && icerik < dugum.sol.icerik) {
            sayac++;
            System.out.println(sayac+ ".kez LL Rotate Uygulandi.");
            return rightRotate(dugum);
        }

        // Sag Sag Rotasyon
        if (balance < -1 && icerik > dugum.sag.icerik) {

            sayac3++;
            System.out.println(sayac3+ ".kez RR Rotate Uygulandi.");
            return leftRotate(dugum);
        }
        // Sol Sag Rotasyon
        if (balance > 1 && icerik > dugum.sol.icerik) {
            sayac2++;
            System.out.println(sayac2+ ".kez LR Rotate Uygulandi.");
            dugum.sol = leftRotate(dugum.sol);
            return rightRotate(dugum);
        }

        // Sag Sol Rotasyon
        if (balance < -1 && icerik < dugum.sag.icerik) {
            sayac1++;
            System.out.println(sayac1+ ".kez RL Rotate Uygulandi.");
            dugum.sag = rightRotate(dugum.sag);
            return leftRotate(dugum);
        }
        return dugum;
    }

    // pre order dolasma
    void preOrder(Dugum dugum) {
        if (dugum != null) {
            System.out.print(dugum.icerik + " ");
            preOrder(dugum.sol);
            preOrder(dugum.sag);
        }
    }
}