import java.util.Iterator;

public class IceCreamIterator implements Iterator<IceCream> {

    private IceCream[] IceCreams;
    private int index;

    public IceCreamIterator(IceCream[] IceCreams){
        this.IceCreams = IceCreams;
    }

    @Override
    public boolean hasNext() {
        return index < IceCreams.length && IceCreams[index] != null;
    }

    @Override
    public IceCream next() {
        return IceCreams[index ++];
    }

}
