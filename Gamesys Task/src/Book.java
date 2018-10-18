	public enum Book {
        MobyDick(1, "Moby Dick", 1851, 15.20),
        TheTerriblePrivacyOfMaxwellSim(2, "The Terrible Privacy of Maxwell Sim", 2010, 13.14),
        StillLifeWithWoodpecker(3, "Still Life With Woodpecker", 1980, 11.05),
        SleepingMurder(4, "Sleeping Murder", 1976, 10.24),
        ThreeMenInABoat(5, "Three Men in a Boat", 1889, 12.87),
    		TheTimeMachine(6, "The Time Machine", 1895, 10.43),
    		TheCavesOfSteel(7, "The Caves of Steel", 1954, 8.12),
    		IdleThoughtsOfAnIdleFellow(8, "Idle Thoughts of an Idle Fellow", 1886, 7.32),
    		AChristmasCarol(9, "A Christmas Carol", 1843, 4.23),
    		ATaleOfTwoCities(10, "A Tale of Two Cities", 1859, 6.32),
    		GreatExpectations(11, "Great Expectations", 1861, 13.21);
    	
		protected int bookNumber;
        protected String bookTitle;
    		protected int bookYear;
        protected double bookPrice;

        private Book(int bookNumber, String bookTitle, int bookYear, double bookPrice) {
        		this.bookNumber = bookNumber;
            this.bookTitle = bookTitle;
        		this.bookYear = bookYear;
            this.bookPrice = bookPrice;
        }

        public static Book getByNumber(int number) {
            for (Book book : values()) {
                if (book.bookNumber == number) {
                    return book;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return bookNumber + " - " + bookTitle + " (" + bookYear + ")" + " - " + String.format("£%.2f", bookPrice);
        }
    }

