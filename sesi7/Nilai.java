package sesi7;

public class Nilai {
    private double quisBertipeDouble;
    private double utsBertipeDouble;
    private double uasBertipeDouble;

    public void setQuis(double x) {
        quisBertipeDouble = x;
    }

    public void setUTS(double x) {
        utsBertipeDouble = x;
    }

    public void setUAS(double x) {
        uasBertipeDouble = x;
    }

    public double getQuis() {
        return quisBertipeDouble;
    }

    public double getUTS() {
        return utsBertipeDouble;
    }

    public double getUAS() {
        return uasBertipeDouble;
    }

    public double getNA() {
        return (quisBertipeDouble + utsBertipeDouble + uasBertipeDouble) / 3;
    }

    public char getIndex() {
        double na = getNA();
        if (na >= 80.0) {
            return 'A';
        } else if (na >= 68.8) {
            return 'B';
        } else if (na >= 56.68) {
            return 'C';
        } else if (na >= 45.56) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public String getKeterangan() {
        char index = getIndex();
        switch (index) {
            case 'A':
                return "Sangat Baik";
            case 'B':
                return "Baik";
            case 'C':
                return "Cukup";
            case 'D':
                return "Kurang";
            default:
                return "Sangat Kurang";
        }
    }
}
