public class Hideout<T> {
    private T hidden;

    public void putIntoHideout(T toHide) {
        this.hidden = toHide;
    }

    public T takeFromHideout() {
        if (this.hidden == null)
            return null;
        T returnObj = this.hidden;
        this.hidden = null;
        return returnObj;
    }

    public boolean isInHideout() {
        if (this.hidden == null)
            return false;
        else
            return true;
    }
}
