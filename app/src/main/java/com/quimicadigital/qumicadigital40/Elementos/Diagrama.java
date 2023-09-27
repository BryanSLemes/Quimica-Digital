package com.quimicadigital.qumicadigital40.Elementos;

public final class Diagrama {

    private static String diagrama;
    public Diagrama(int numero_atomico) {

        String formando = "";
        boolean verif = false;

        if ((iniciais(numero_atomico)).equals("")) {
            verif = true;
            OUTER:
            for (int i = 0; i <= 8; i++) {
                switch (i) {
                    case 1:
                        if (numero_atomico <= 2) {
                            formando = "1s" + numero_atomico;
                            break OUTER;
                        } else {
                            formando = "1s2, ";
                            numero_atomico = numero_atomico - 2;
                        }
                        break;
                    case 2:
                        if (numero_atomico <= 2) {
                            formando = formando + "2s" + numero_atomico;
                            break OUTER;
                        } else if (numero_atomico <= 8) {
                            formando = formando + "2s2, ";
                            numero_atomico = numero_atomico - 2;
                            formando = formando + "2p" + numero_atomico;
                            break OUTER;
                        } else if (numero_atomico > 8) {
                            formando = "1s2, 2s2, 2p6, ";
                            numero_atomico = numero_atomico - 8;
                        }   break;
                    case 3:
                        if (numero_atomico <= 2) {
                            formando = formando + "3s" + numero_atomico;
                            break OUTER;
                        } else if (numero_atomico <= 8) {
                            formando = formando + "3s2, ";
                            numero_atomico = numero_atomico - 2;
                            formando = formando + "3p" + numero_atomico;
                            break OUTER;
                        } else if (numero_atomico > 8) {
                            formando = "1s2, 2s2, 2p6, 3s2, 3p6, ";
                            numero_atomico = numero_atomico - 8;
                        }   break;
                    case 4:
                        if (numero_atomico <= 2) {
                            formando = formando + "4s" + numero_atomico;
                            break OUTER;
                        } else if (numero_atomico <= 18) {
                            if (numero_atomico <= 10) {
                                formando = formando + "4s2, ";
                                numero_atomico = numero_atomico - 2;
                                formando = formando + "3d" + numero_atomico;
                                break OUTER;
                            } else {
                                formando = formando + "4s2, ";
                                numero_atomico = numero_atomico - 2;
                                formando = formando + "3d10, ";
                                numero_atomico = numero_atomico - 10;
                                formando = formando + "4p" + numero_atomico;
                                break OUTER;
                            }
                        } else if (numero_atomico > 18) {
                            formando = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, ";
                            numero_atomico = numero_atomico - 18;
                        }   break;
                    case 5:
                        if (numero_atomico <= 2) {
                            formando = formando + "5s" + numero_atomico;
                            break OUTER;
                        } else if (numero_atomico <= 18) {
                            if (numero_atomico <= 10) {
                                formando = formando + "5s2, ";
                                numero_atomico = numero_atomico - 2;
                                formando = formando + "4d" + numero_atomico;
                                break OUTER;
                            } else {
                                formando = formando + "5s2, ";
                                numero_atomico = numero_atomico - 2;
                                formando = formando + "4d10, ";
                                numero_atomico = numero_atomico - 10;
                                formando = formando + "5p" + numero_atomico;
                                break OUTER;
                            }
                        } else if (numero_atomico > 18) {
                            formando = formando + "5s2, 4d10, 5p6, ";
                            numero_atomico = numero_atomico - 18;
                        }   break;
                    case 6:
                        if (numero_atomico <= 2) {
                            formando = formando + "6s" + numero_atomico;
                            break OUTER;
                        } else if (numero_atomico <= 32) {
                            if (numero_atomico <= 14) {
                                formando = formando + "6s2, ";
                                numero_atomico = numero_atomico - 2;
                                formando = formando + "4f" + numero_atomico;
                                break OUTER;
                            } else if (numero_atomico <= 24 && numero_atomico > 14) {
                                formando = formando + "6s2, ";
                                numero_atomico = numero_atomico - 2;
                                formando = formando + "4f14, ";
                                numero_atomico = numero_atomico - 14;
                                formando = formando + "5d" + numero_atomico;
                                break OUTER;
                            } else {
                                formando = formando + "6s2, ";
                                numero_atomico = numero_atomico - 2;
                                formando = formando + "4f14, ";
                                numero_atomico = numero_atomico - 14;
                                formando = formando + "5d10, ";
                                numero_atomico = numero_atomico - 10;
                                formando = formando + "6p" + numero_atomico;
                                break OUTER;
                            }
                        } else if (numero_atomico > 32) {
                            formando = formando + "6s2, 4f14, 5d10, 6p6, ";
                            numero_atomico = numero_atomico - 32;
                        }   break;
                    case 7:
                        if (numero_atomico <= 2) {
                            formando = formando + "7s" + numero_atomico;
                            break OUTER;
                        } else if (numero_atomico <= 26) {
                            if (numero_atomico <= 14) {
                                formando = formando + "7s2, ";
                                numero_atomico = numero_atomico - 2;
                                formando = formando + "5f" + numero_atomico;
                                break OUTER;
                            } else {
                                formando = formando + "7s2, ";
                                numero_atomico = numero_atomico - 2;
                                formando = formando + "5f14, ";
                                numero_atomico = numero_atomico - 14;
                                formando = formando + "6d" + numero_atomico;
                                break OUTER;
                            }
                        } else if (numero_atomico > 26) {
                            formando = formando + "7s2, 5f14, 6d10, ";
                            numero_atomico = numero_atomico - 26;
                        }   break;
                    case 8:
                        formando = formando + "7p" + numero_atomico;
                        break;
                    default:
                        break;
                }
            }
        }
        if (verif == true) {
            diagrama = formando;
        }
    }

    public String iniciais(int inicial) {
        String fechamento = "";

        switch (inicial) {
            case 24:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s1, 3d5";
                break;
            case 25:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d5";
                break;
            case 26:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d6";
                break;
            case 27:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d7";
                break;
            case 28:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d8";
                break;
            case 29:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s1, 3d10";
                break;
            case 30:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10";
                break;
            case 41:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s1, 4d4";
                break;
            case 42:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s1, 4d5";
                break;
            case 43:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d5";
                break;
            case 44:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s1, 4d7";
                break;
            case 45:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s1, 4d8";
                break;
            case 46:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s0, 4d10";
                break;
            case 47:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s1, 4d10";
                break;
            case 48:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10";
                break;
            case 57:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f0, 5d1";
                break;
            case 58:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f1, 5d1";
                break;
            case 59:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f3, 5d0";
                break;
            case 60:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f4, 5d0";
                break;
            case 61:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f5, 5d0";
                break;
            case 62:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f6, 5d0";
                break;
            case 63:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f7, 5d0";
                break;
            case 64:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f7, 5d1";
                break;
            case 65:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f9, 5d0";
                break;
            case 66:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f10, 5d0";
                break;
            case 67:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f11, 5d0";
                break;
            case 68:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f12, 5d0";
                break;
            case 69:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f13, 5d0";
                break;
            case 70:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d0";
                break;
            case 78:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s1, 4f14, 5d9";
                break;
            case 79:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s1, 4f14, 5d10";
                break;
            case 80:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10";
                break;
            case 89:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10, 6p6, 7s2, 6d1";
                break;
            case 90:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10, 6p6, 7s2, 6d2";
                break;
            case 91:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10, 6p6, 7s2, 5f2, 6d1";
                break;
            case 92:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10, 6p6, 7s2, 5f3, 6d1";
                break;
            case 93:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10, 6p6, 7s2, 5f4, 6d1";
                break;
            case 94:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10, 6p6, 7s2, 5f6, 6d0";
                break;
            case 95:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10, 6p6, 7s2, 5f7, 6d0";
                break;
            case 96:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10, 6p6, 7s2, 5f7, 6d1";
                break;
            case 97:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10, 6p6, 7s2, 5f9, 6d0";
                break;
            case 98:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10, 6p6, 7s2, 5f10, 6d0";
                break;
            case 99:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10, 6p6, 7s2, 5f11, 6d0";
                break;
            case 100:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10, 6p6, 7s2, 5f12, 6d0";
                break;
            case 101:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10, 6p6, 7s2, 5f13, 6d0";
                break;
            case 102:
                fechamento = "1s2, 2s2, 2p6, 3s2, 3p6, 4s2, 3d10, 4p6, 5s2, 4d10, 5p6, 6s2, 4f14, 5d10, 6p6, 7s2, 5f14, 6d0";
                break;
            default:
                break;
        }
        if (!fechamento.equals("")) {
            diagrama = fechamento;
        }
        return fechamento;
    }

    public static String getDiagrama() {
        return diagrama;
    }
}

