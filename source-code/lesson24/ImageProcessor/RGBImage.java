public class RGBImage{

    // folder to look for image files
    private String defaultDirectory = "images";    

    // The pixels are stored in three 2D arrays.
    // These are the data structures we will use to perform 
    // the actual image manipulation.
    private int red[][];
    private int green[][];
    private int blue[][];
    
    // Helper will do the 'ugly' Java stuff (saving images to files, etc)
    private Helper myHelper;
    
    
    // Constructor, use an open file dialog to specify image
    public RGBImage() {
        myHelper = new Helper(this, defaultDirectory);
    }
    
    // Constructor, String argument specifies filename of image
    public RGBImage(String filename) {
        myHelper = new Helper(this, defaultDirectory, filename);
    }
    
    // this is called from Helper, when a new image is loaded from a file.  
    // You never need to call it.
    protected void updateArrays(int[][] red, int [][] green, int[][] blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    
    // Call this method to load a new image
    public void load() {
        myHelper.load(defaultDirectory);
    }
    
    // Call this method to save the image to the same file
    public void save() {
        myHelper.save();
    }

    // Call this method to save the image to a different file name
    public void saveAs(String filename) {
        myHelper.saveAs(filename);
    }
    
    // call this in case you closed the viewer, but want to see it again.
    public void show() {
        myHelper.show();
    }
    
    
    // This method should always be called after manipulating 
    // the pixels via the 2D arrays.  
    private void refresh() {
        myHelper.refresh(red, green, blue);
    }
    
    
    ///////////
    /////////// Image manipulation methods
    ///////////
    // Your code goes here.  
    // Don't forget to call refresh() after manipulating the red, green, and blue pixel arrays
    
    
    // Example: flips the image vertically.
    public void flipVertical() {
        int height = red.length;
        int width = red[0].length;
        
        int [][] tempR = new int[height][width];
        int [][] tempB = new int[height][width];
        int [][] tempG = new int[height][width];
        
        // Flip the red channel.
        for (int h=0;h<height;h++) {
            for (int w=0;w<width;w++) {
                tempR[h][w] = red[height-h-1][w];
                tempG[h][w] = green[height-h-1][w];
                tempB[h][w] = blue[height-h-1][w];
            }
        } 
        for (int h=0;h<height;h++) {
            for (int w=0;w<width;w++) {
                red[h][w] = tempR[h][w];
                green[h][w] = tempG[h][w];
                blue[h][w] = tempB[h][w];
            }
        } 
                
        // Always do this after manipulating pixels.
        refresh();
    }


}
