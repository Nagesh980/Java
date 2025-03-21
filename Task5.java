public class ArrayExamples {
    public static void main(String[] args) {

        // Shirt array
        String[] shirts = {"Red Shirt", "Blue Shirt", "Green Shirt", "Black Shirt", "White Shirt"};

        // Clip array
        String[] clips = {"Small Clip", "Big Clip", "Color Clip", "Metal Clip", "Plastic Clip"};

        // Paint array
        String[] paints = {"Red Paint", "Blue Paint", "Green Paint", "Yellow Paint", "Black Paint"};

        // Wire array
        String[] wires = {"Copper Wire", "Fiber Wire", "Steel Wire", "Plastic Wire", "Iron Wire"};

        // Wall array
        String[] walls = {"Brick Wall", "Concrete Wall", "Wooden Wall", "Glass Wall", "Stone Wall"};

        // Paper array
        String[] papers = {"A4 Paper", "Chart Paper", "Tissue Paper", "Glossy Paper", "Bond Paper"};

        // Poster array
        String[] posters = {"Movie Poster", "Educational Poster", "Advertisement Poster", "Event Poster", "Art Poster"};

        // Wallet array
        String[] wallets = {"Leather Wallet", "Fabric Wallet", "Travel Wallet", "Coin Wallet", "Card Wallet"};

        System.out.println("Shirts:");
        for (int i = 0; i < shirts.length; i++) {
            System.out.println(shirts[i]);
        }

        System.out.println("\nClips:");
        for (int i = 0; i < clips.length; i++) {
            System.out.println(clips[i]);
        }

        System.out.println("\nPaints:");
        for (int i = 0; i < paints.length; i++) {
            System.out.println(paints[i]);
        }

        System.out.println("\nWires:");
        for (int i = 0; i < wires.length; i++) {
            System.out.println(wires[i]);
        }

        System.out.println("\nWalls:");
        for (int i = 0; i < walls.length; i++) {
            System.out.println(walls[i]);
        }

        System.out.println("\nPapers:");
        for (int i = 0; i < papers.length; i++) {
            System.out.println(papers[i]);
        }

        System.out.println("\nPosters:");
        for (int i = 0; i < posters.length; i++) {
            System.out.println(posters[i]);
        }

        System.out.println("\nWallets:");
        for (int i = 0; i < wallets.length; i++) {
            System.out.println(wallets[i]);
        }
    }
}

public class ItemArrays {
    public static void main(String[] args) {

        String[] coins = {"1 Rupee", "2 Rupees", "5 Rupees", "10 Rupees", "50 Paise"};

        String[] notes = {"10 Rupees", "20 Rupees", "50 Rupees", "100 Rupees", "200 Rupees"};

        String[] watches = {"Digital Watch", "Analog Watch", "Smart Watch", "Sports Watch", "Classic Watch"};

        String[] cameras = {"DSLR Camera", "Mirrorless Camera", "Action Camera", "Polaroid Camera", "CCTV Camera"};

        String[] games = {"Cricket", "Football", "Chess", "Video Game", "Badminton"};

        String[] bags = {"School Bag", "Laptop Bag", "Travel Bag", "Hand Bag", "Duffel Bag"};

        String[] pots = {"Clay Pot", "Flower Pot", "Tea Pot", "Pressure Cooker Pot", "Soup Pot"};

        String[] routers = {"WiFi Router", "DSL Router", "Cable Router", "Wireless Router", "Gaming Router"};

        System.out.println("Coins:");
        for (String coin : coins) {
            System.out.println(coin);
        }

        System.out.println("\nNotes:");
        for (String note : notes) {
            System.out.println(note);
        }

        System.out.println("\nWatches:");
        for (String watch : watches) {
            System.out.println(watch);
        }

        System.out.println("\nCameras:");
        for (String camera : cameras) {
            System.out.println(camera);
        }

        System.out.println("\nGames:");
        for (String game : games) {
            System.out.println(game);
        }

        System.out.println("\nBags:");
        for (String bag : bags) {
            System.out.println(bag);
        }

        System.out.println("\nPots:");
        for (String pot : pots) {
            System.out.println(pot);
        }

        System.out.println("\nRouters:");
        for (String router : routers) {
            System.out.println(router);
        }
    }
}