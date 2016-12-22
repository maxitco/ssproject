package ss.week2;

public class Rectangle {
    private int length;
    private int width;

    //@ invariant length() > 0;
    //@ invariant width() > 0;
    /**
     * Create a new Rectangle with the specified length and width.
     */
    /*@ requires theLength > 0 && theWidth > 0; */
    public Rectangle(int theLength, int theWidth) {
    	this.length = theLength;
    	this.width = theWidth;
    }
    
    /**
     * The length of this Rectangle.
     */
    /*@ ensures \result >= 0;
    /*@pure */
    public int length() {
	return this.length;
    }

    /**
     * The width of this Rectangle.
     */
    /*@ ensures \result >= 0; */
    /*@pure */
    public int width() {
	return this.width;
    }

    /**
     * The area of this Rectangle.
     */
    /* 2.3: for other geometric forms, you would need to know which form and change the formula accordingly.
     * 
     */
    /**/
    /*@ ensures \result > 0; */
    /*@pure;*/
    public int area() {
    	assert this.length > 0;
    	assert this.width > 0;
	return this.length*this.width;
    }

    /**
     * The perimeter of this Rectangle.
     */
    /*@ ensures \result > 0; */
    /*@pure*/
    public int perimeter() {
    	assert this.length > 0;
    	assert this.width > 0;
	return 2*(this.width+this.length);
    }
}
