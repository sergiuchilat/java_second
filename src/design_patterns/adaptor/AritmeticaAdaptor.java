package design_patterns.adaptor;

public class AritmeticaAdaptor {
    public Integer add(Integer x, Integer y){
        Artitmetica artitmetica = new Artitmetica();
        return artitmetica.add(x.floatValue(), y.floatValue()).intValue();
    }
}
