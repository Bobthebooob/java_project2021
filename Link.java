public class Link {
    double x0, y0, l, fi;

    public Link(double x0, double y0, double l, double fi) {
        this.x0 = x0;
        this.y0 = y0;
        this.l = l;
        this.fi = fi;
    }

    public double[] getEnd() {
        double e[] = new double[2];
        e[0] = x0 + l * Math.cos(fi);
        e[1] = y0 + l * Math.sin(fi);
        return e;
    }

    public String toString() {
        double e[] = getEnd();
        //return String.format("line\n%5.3f,%5.3f\n%5.3f,%5.3f\n",x0, y0, e[0], e[1] );
       return String.format("%5.3f,%5.3f\n%5.3f,%5.3f\n", x0, y0, e[0], e[1]);
    }
}
