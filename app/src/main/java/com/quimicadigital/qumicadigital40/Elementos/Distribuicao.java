package com.quimicadigital.qumicadigital40.Elementos;

public final class Distribuicao {

    private int[] camadas = new int[7];
    boolean verif;

    public Distribuicao(int numero_atomico) {
        if (!(iniciais(numero_atomico))) {
            camadas[0] = 0;
            camadas[1] = 0;
            camadas[2] = 0;
            camadas[3] = 0;
            camadas[4] = 0;
            camadas[5] = 0;
            camadas[6] = 0;
            OUTER:
            for (int i = 0; i <= 8; i++) {
                switch (i) {
                    case 1 : {
                        if (numero_atomico <= 2) {
                            camadas[0] = numero_atomico;
                            break OUTER;
                        } else {
                            camadas[0] = 2;
                            numero_atomico = numero_atomico - 2;
                        }
                    }
                    case 2 : {
                        if (numero_atomico <= 8) {
                            camadas[1] = numero_atomico;
                            break OUTER;
                        } else if (numero_atomico > 8) {
                            camadas[1] = 8;
                            numero_atomico = numero_atomico - 8;
                        }
                    }
                    case 3 : {
                        if (numero_atomico <= 8) {
                            camadas[2] = numero_atomico;
                            break OUTER;
                        } else if (numero_atomico > 8) {
                            camadas[2] = 8;
                            numero_atomico = numero_atomico - 8;
                        }
                    }
                    case 4 : {
                        if (numero_atomico <= 2) {
                            camadas[3] = numero_atomico;
                            break OUTER;
                        }
                        camadas[2] = 18;
                        numero_atomico = numero_atomico - 10;
                        if (numero_atomico <= 10) {
                            if (numero_atomico <= 8) {
                                camadas[3] = numero_atomico;
                                break OUTER;
                            } else {
                                camadas[3] = 8;
                                numero_atomico = numero_atomico - 8;
                                camadas[4] = numero_atomico;
                                break OUTER;
                            }
                        } else if (numero_atomico > 10) {
                            camadas[3] = 18;
                            numero_atomico = numero_atomico - 18;
                            camadas[4] = numero_atomico;
                        }
                    }
                    case 5 : {
                        if (numero_atomico <= 8) {
                            camadas[4] = numero_atomico;
                            break OUTER;
                        } else {
                            if (numero_atomico <= 10) {
                                camadas[4] = 8;
                                numero_atomico = numero_atomico - 8;
                                camadas[5] = numero_atomico;
                                break OUTER;
                            } else {
                                camadas[4] = 8;
                                numero_atomico = numero_atomico - 8;
                                camadas[5] = 2;
                                numero_atomico = numero_atomico - 2;
                            }
                        }
                    }
                    case 6 : {
                        numero_atomico = numero_atomico - 22;
                        camadas[3] = 32;
                        camadas[4] = 18;
                        if (numero_atomico <= 8) {
                            camadas[5] = numero_atomico;
                            break OUTER;
                        } else {
                            camadas[5] = 8;
                            numero_atomico = numero_atomico - 8;
                            camadas[6] = numero_atomico;
                            if (numero_atomico <= 10) {
                                camadas[6] = numero_atomico;
                                break OUTER;
                            } else {
                                camadas[5] = 8;
                                numero_atomico = numero_atomico - 8;
                                camadas[6] = numero_atomico;
                                numero_atomico = numero_atomico - 2;
                            }
                        }
                    }
                    case 7 : {
                        numero_atomico = numero_atomico - 6;
                        camadas[3] = 32;
                        camadas[4] = 32;
                        camadas[5] = 8;
                        camadas[6] = 2;
                        if (numero_atomico <= 10) {
                            camadas[5] = camadas[5] + numero_atomico;
                            break OUTER;
                        } else {
                            camadas[5] = 18;
                            numero_atomico = numero_atomico - 8;
                        }
                    }
                    case 8 :
                        camadas[6] = numero_atomico;
                    default : {
                    }
                }
            }
        }
    }

    public boolean iniciais(int inicial) {
        verif = false;
        camadas[0] = 2;
        camadas[1] = 8;

        if (inicial <= 30) {
            camadas[2] = 9;
            camadas[3] = 2;
            switch (inicial) {
                case 21 :
                    verif = true;
                    break;
                case 22 : {
                    camadas[2] = 10;
                    verif = true;
                    break;
                }
                case 23 : {
                    camadas[2] = 11;
                    verif = true;
                    break;
                }
                case 24 : {
                    camadas[2] = 13;
                    camadas[3] = 1;
                    verif = true;
                    break;
                }
                case 25 : {
                    camadas[2] = 13;
                    verif = true;
                    break;
                }
                case 26 : {
                    camadas[2] = 14;
                    verif = true;
                    break;
                }
                case 27 :{
                    camadas[2] = 15;
                    verif = true;
                    break;
                }
                case 28 : {
                    camadas[2] = 16;
                    verif = true;
                    break;
                }
                case 29 : {
                    camadas[2] = 18;
                    camadas[3] = 1;
                    verif = true;
                    break;
                }
                case 30 : {
                    camadas[2] = 18;
                    verif = true;
                    break;
                }
                default : {
                }
            }
        } else if (inicial <= 48) {
            camadas[2] = 18;
            camadas[3] = 9;
            camadas[4] = 2;
            switch (inicial) {
                case 39 :
                    verif = true;
                    break;
                case 40 : {
                    camadas[3] = 10;
                    verif = true;
                    break;
                }
                case 41 : {
                    camadas[3] = 12;
                    camadas[4] = 1;
                    verif = true;
                    break;
                }
                case 42 : {
                    camadas[3] = 13;
                    camadas[4] = 1;
                    verif = true;
                    break;
                }
                case 43 : {
                    camadas[3] = 13;
                    verif = true;
                    break;
                }
                case 44 : {
                    camadas[3] = 15;
                    camadas[4] = 1;
                    verif = true;
                    break;
                }
                case 45 : {
                    camadas[3] = 16;
                    camadas[4] = 1;
                    verif = true;
                    break;
                }
                case 46 : {
                    camadas[3] = 18;
                    camadas[4] = 0;
                    verif = true;
                    break;
                }
                case 47 : {
                    camadas[3] = 18;
                    camadas[4] = 1;
                    verif = true;
                    break;
                }
                case 48 : {
                    camadas[3] = 18;
                    verif = true;
                    break;
                }
                default : {
                }
            }
        } else if (inicial <= 70) {
            camadas[2] = 18;
            camadas[3] = 18;
            camadas[4] = 8;
            camadas[5] = 2;
            switch (inicial) {
                case 57 : {
                    camadas[4] = 9;
                    verif = true;
                    break;
                }
                case 58 : {
                    camadas[3] = 20;
                    verif = true;
                    break;
                }
                case 59 : {
                    camadas[3] = 21;
                    verif = true;
                    break;
                }
                case 60 : {
                    camadas[3] = 22;
                    verif = true;
                    break;
                }
                case 61 : {
                    camadas[3] = 23;
                    verif = true;
                    break;
                }
                case 62 : {
                    camadas[3] = 24;
                    verif = true;
                    break;
                }
                case 63 : {
                    camadas[3] = 25;
                    verif = true;
                    break;
                }
                case 64 :{
                    camadas[3] = 25;
                    camadas[4] = 9;
                    verif = true;
                    break;
                }
                case 65 : {
                    camadas[3] = 27;
                    verif = true;
                    break;
                }
                case 66 : {
                    camadas[3] = 28;
                    verif = true;
                    break;
                }
                case 67 : {
                    camadas[3] = 29;
                    verif = true;
                    break;
                }
                case 68 : {
                    camadas[3] = 30;
                    verif = true;
                    break;
                }
                case 69 : {
                    camadas[3] = 31;
                    verif = true;
                    break;
                }
                case 70 : {
                    camadas[3] = 32;
                    verif = true;
                    break;
                }
                default : {
                }
            }
        } else if (inicial <= 80) {
            camadas[2] = 18;
            camadas[3] = 32;
            camadas[5] = 2;
            switch (inicial) {
                case 71 : {
                    camadas[4] = 9;
                    verif = true;
                    break;
                }
                case 72 : {
                    camadas[4] = 10;
                    verif = true;
                    break;
                }
                case 73 : {
                    camadas[4] = 11;
                    verif = true;
                    break;
                }
                case 74 : {
                    camadas[4] = 12;
                    verif = true;
                    break;
                }
                case 75 : {
                    camadas[4] = 13;
                    verif = true;
                    break;
                }
                case 76 : {
                    camadas[4] = 14;
                    verif = true;
                    break;
                }
                case 77 : {
                    camadas[4] = 15;
                    verif = true;
                    break;
                }
                case 78 : {
                    camadas[4] = 17;
                    camadas[5] = 1;
                    verif = true;
                    break;
                }
                case 79 : {
                    camadas[4] = 18;
                    camadas[5] = 1;
                    verif = true;
                    break;
                }
                case 80 :{
                    camadas[4] = 18;
                    verif = true;
                    break;
                }
                default :{
                }
            }
        } else if (inicial <= 102) {
            camadas[2] = 18;
            camadas[3] = 32;
            camadas[4] = 18;
            camadas[6] = 2;
            switch (inicial) {
                case 89 : {
                    camadas[5] = 9;
                    verif = true;
                    break;
                }
                case 90 : {
                    camadas[5] = 10;
                    verif = true;
                    break;
                }
                case 91 : {
                    camadas[4] = 20;
                    camadas[5] = 9;
                    verif = true;
                    break;
                }
                case 92 : {
                    camadas[4] = 21;
                    camadas[5] = 9;
                    verif = true;
                    break;
                }
                case 93 : {
                    camadas[4] = 22;
                    camadas[5] = 9;
                    verif = true;
                    break;
                }
                case 94 : {
                    camadas[4] = 24;
                    camadas[5] = 8;
                    verif = true;
                    break;
                }
                case 95 : {
                    camadas[4] = 25;
                    camadas[5] = 8;
                    verif = true;
                    break;
                }
                case 96 : {
                    camadas[4] = 25;
                    camadas[5] = 9;
                    verif = true;
                    break;
                }
                case 97 : {
                    camadas[4] = 27;
                    camadas[5] = 8;
                    verif = true;
                    break;
                }
                case 98 : {
                    camadas[4] = 28;
                    camadas[5] = 8;
                    verif = true;
                    break;
                }
                case 99 : {
                    camadas[4] = 29;
                    camadas[5] = 8;
                    verif = true;
                    break;
                }
                case 100 : {
                    camadas[4] = 30;
                    camadas[5] = 8;
                    verif = true;
                    break;
                }
                case 101 : {
                    camadas[4] = 31;
                    camadas[5] = 8;
                    verif = true;
                    break;
                }
                case 102 :{
                    camadas[4] = 32;
                    camadas[5] = 8;
                    verif = true;
                    break;
                }
            }
        }
        return verif;
    }

    public int[] getCamadas() {
        return camadas;
    }
}
