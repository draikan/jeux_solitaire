public class Carte {
	
	public boolean red;
	int val ;
    int color ;
    private boolean visible;
      
    public Carte (int val, int color) {
        this.red = color < 2? true : false;
        this.val = val;
        this.color = color;
        this.visible = false;
    }


    public String print() {
        String[] colors2 = {"?","?","?","?"};
        String[] colors = {"Carreau","Coeur","Trefle","Pique"};
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        if (visible) {
            return colors[color] + values[val] ;
        } else {
        	return("--");
        }
    }

    public void makeVisible() {
        visible = true;
    }

    public boolean isVisible() {
        return visible;
    }
}
