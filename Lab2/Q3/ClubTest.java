package Q3;

public class ClubTest {

    public static void main(String[] args){

        SportsClub sports = new SportsClub("Basketball Club", 10);

        System.out.println("Sports Club name: " + sports.getName());
        System.out.println("Sports Club budget: " +sports.determineBudget());

        sports.addMember(5);
        System.out.println("Sports Club budget after adding members: " +sports.determineBudget());

        sports.changeName("New Sports Club");
        System.out.println("Sports Club name after changing name: " +sports.getName());

        MarketingClub marketing = new MarketingClub("Marketing Club", 5, 800);

        System.out.println("Use 600 budget: " + marketing.useBudget(600));

        System.out.println("Marketing Club budget after spending: " + marketing.determineBudget());
    }
}
