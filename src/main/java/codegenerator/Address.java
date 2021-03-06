package codegenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */
public class Address {
    public int num;
    public TypeAddress Type;
    public VarType varType;

    public Address(int num, VarType varType, TypeAddress type) {
        this.num = num;
        this.Type = type;
        this.varType = varType;
    }

    public Address(int num, VarType varType) {
        this.num = num;
        this.Type = TypeAddress.Direct;
        this.varType = varType;
    }
    public String toString(){
        switch (Type){
            case Direct:
                return num+"";
            case Indirect:
                return "@"+num;
            case Imidiate:
                return "#"+num;
        }
        return num+"";
    }
}
