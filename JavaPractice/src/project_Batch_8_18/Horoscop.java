package project_Batch_8_18;

import java.util.Scanner;

public class Horoscop {

    public static void welcomeMessage(){

        String welcome_message = "\t\t\t* Welcome to the \"Find Your Future App\"" +
                "\n\t\t\t* You are in the right place to find your future" +
                "\n\t\t\t* Let's get started!";

        System.out.println(welcome_message);

    }

    public static void goodbyeMessage(){

        String goodbyeMessage = "\t\t\t* Thank you for choosing to \"Find Your Future App\"" +
                "\n\t\t\t* May a good future be with you.”" +
                "\n\t\t\t* GoodBye!";

        System.out.println(goodbyeMessage);

    }

    public static void logo(){

        String logo = "\t\t\t    *****************   " +
                "\n\t\t\t**          *           **" +
                "\n\t\t\t**          *           **" +
                "\n\t\t\t**         FIND         **" +
                "\n\t\t\t**         YOUR         **" +
                "\n\t\t\t**        FUTURE        **" +
                "\n\t\t\t**          *           **" +
                "\n\t\t\t**          *           **" +
                "\n\t\t\t    *****************   ";

        System.out.println(logo);


    }



    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String result = "";
        String astro_sign = "";



        // LOGO PART
        System.out.println();
        logo();
        System.out.println();

        // WELCOME MESSAGE
        welcomeMessage();
        System.out.println();

        // INFORMATION GATHERING - DAY
        System.out.println("Please enter the day you have been born:");
        System.out.println("Valid Days: 1-31:");
        int day = scan.nextInt();
        if (!(day > 0 && day < 32)) {
            System.err.println("Invalid Entry");
            System.out.println();
            logo();
            goodbyeMessage();
            System.exit(0);
        }
        // INFORMATION GATHERING - MONTH
        System.out.println("Please enter the months you have been born:");
        System.out.println("Valid Months: 1-12:");
        int month = scan.nextInt();
        if (!(month > 0 && month < 13)) {
            System.err.println("Invalid Entry");
            System.out.println();
            logo();
            goodbyeMessage();
            System.exit(0);
        }

        // DETERMINE THE ZODIAC SIGN
        if (month == 3 && day >= 21) {
            result = "Aries";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    *****************   ");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t**    ***       ***     **");
            System.out.println("\t\t\t**   *   *     *   *    **");
            System.out.println("\t\t\t**        *  *          **");
            System.out.println("\t\t\t**          *           **");
            System.out.println("\t\t\t**          *           **");
            System.out.println("\t\t\t**          *           **");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t    *****************   ");
            System.out.println();
            System.err.println("\t\t     Your zodiac sign is " + result);
            System.err.println("The first sign of the zodiac, Aries loves to be number one. \nNaturally, this dynamic fire sign is no stranger to competition. " +
                    "\nBold and ambitious, Aries dives headfirst into even the most challenging situations—and they'll make sure they always come out on top!");

        } else if (month == 4 && day <= 20) {
            result = "Aries";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    *****************   ");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t**    ***       ***     **");
            System.out.println("\t\t\t**   *   *     *   *    **");
            System.out.println("\t\t\t**        *  *          **");
            System.out.println("\t\t\t**          *           **");
            System.out.println("\t\t\t**          *           **");
            System.out.println("\t\t\t**          *           **");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t    *****************   ");
            System.out.println();
            System.err.println("\t\t     Your zodiac sign is " + result);
            System.err.println("The first sign of the zodiac, Aries loves to be number one. \nNaturally, this dynamic fire sign is no stranger to competition. " +
                    "\nBold and ambitious, Aries dives headfirst into even the most challenging situations—and they'll make sure they always come out on top!");
        } else if (month == 4 && day >= 21) {
            result = "Taurus";
            System.out.println("\t\t\t    *****************   ");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t**    ***       ***     **");
            System.out.println("\t\t\t**       *******        **");
            System.out.println("\t\t\t**      **     **       **");
            System.out.println("\t\t\t**     **       **      **");
            System.out.println("\t\t\t**     **       **      **");
            System.out.println("\t\t\t**      **     **       **");
            System.out.println("\t\t\t**          **          **");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t    *****************   ");
            System.out.println();
            System.err.println("\t\t     Your zodiac sign is " + result);
            System.err.println("What sign is more likely to take a six-hour bath, followed by a luxurious Swedish massage and decadent dessert spread? \nWhy Taurus, of course! Taurus is an earth sign represented by the bull. " +
                    "\nLike their celestial spirit animal, Taureans enjoy relaxing in serene, bucolic environments surrounded by soft sounds, soothing aromas, and succulent flavors.");

        } else if (month == 5 && day <= 21) {
            result = "Taurus";
            System.out.println("\t\t\t    *****************   ");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t**    ***       ***     **");
            System.out.println("\t\t\t**       *******        **");
            System.out.println("\t\t\t**      **     **       **");
            System.out.println("\t\t\t**     **       **      **");
            System.out.println("\t\t\t**     **       **      **");
            System.out.println("\t\t\t**      **     **       **");
            System.out.println("\t\t\t**          **          **");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t    *****************   ");
            System.out.println();
            System.err.println("\t\t     Your zodiac sign is " + result);
            System.err.println("What sign is more likely to take a six-hour bath, followed by a luxurious Swedish massage and decadent dessert spread? \nWhy Taurus, of course! Taurus is an earth sign represented by the bull. " +
                    "\nLike their celestial spirit animal, Taureans enjoy relaxing in serene, bucolic environments surrounded by soft sounds, soothing aromas, and succulent flavors.");
        } else if (month == 5 && day >= 22) {
            result = "Gemini";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    *****************   ");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t**    ***       ***     **");
            System.out.println("\t\t\t**       *******        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       *******        **");
            System.out.println("\t\t\t**    ***       ***     **");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t    *****************   ");
            System.out.println();
            System.err.println("\t\t     Your zodiac sign is " + result);
            System.err.println("Have you ever been so busy that you wished you could clone yourself just to get everything done? \nThat's the Gemini experience in a nutshell. Spontaneous, playful, and adorably erratic, Gemini is driven by its insatiable curiosity. " +
                    "\nAppropriately symbolized by the celestial twins, this air sign was interested in so many pursuits that it had to double itself.");
        } else if (month == 6 && day <= 21) {
            result = "Gemini";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    *****************   ");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t**    ***       ***     **");
            System.out.println("\t\t\t**       *******        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       *******        **");
            System.out.println("\t\t\t**    ***       ***     **");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t    *****************   ");
            System.out.println();
            System.err.println("\t\t     Your zodiac sign is " + result);
            System.err.println("Have you ever been so busy that you wished you could clone yourself just to get everything done? \nThat's the Gemini experience in a nutshell. Spontaneous, playful, and adorably erratic, Gemini is driven by its insatiable curiosity. " +
                    "\nAppropriately symbolized by the celestial twins, this air sign was interested in so many pursuits that it had to double itself.");
        } else if (month == 6 && day >= 22) {
            result = "Cancer";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    ********************   ");
            System.out.println("\t\t\t**                         **");
            System.out.println("\t\t\t**       **************    **");
            System.out.println("\t\t\t**       ** **             **");
            System.out.println("\t\t\t**      **   **            **");
            System.out.println("\t\t\t**       ** **             **");
            System.out.println("\t\t\t**                         **");
            System.out.println("\t\t\t**                ** **    **");
            System.out.println("\t\t\t**               **   **   **");
            System.out.println("\t\t\t**                ** **    **");
            System.out.println("\t\t\t**     ***************     **");
            System.out.println("\t\t\t**                         **");
            System.out.println("\t\t\t    ********************   ");
            System.out.println();
            System.err.println("\t\t     Your zodiac sign is " + result);
            System.err.println("Represented by the crab, Cancer seamlessly weaves between the sea and shore representing Cancer’s ability to exist in both emotional and material realms. \nCancers are highly intuitive and their psychic abilities manifest in tangible spaces. But—just like the hard-shelled crustaceans—this water sign is willing to do whatever it takes to protect itself emotionally." +
                    "\nIn order to get to know this sign, you're going to need to establish trust!");
        } else if (month == 7 && day <= 22) {
            result = "Cancer";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    ********************   ");
            System.out.println("\t\t\t**                         **");
            System.out.println("\t\t\t**       **************    **");
            System.out.println("\t\t\t**       ** **             **");
            System.out.println("\t\t\t**      **   **            **");
            System.out.println("\t\t\t**       ** **             **");
            System.out.println("\t\t\t**                         **");
            System.out.println("\t\t\t**                ** **    **");
            System.out.println("\t\t\t**               **   **   **");
            System.out.println("\t\t\t**                ** **    **");
            System.out.println("\t\t\t**     ***************     **");
            System.out.println("\t\t\t**                         **");
            System.out.println("\t\t\t    ********************   ");
            System.out.println();
            System.err.println("\t\t     Your zodiac sign is " + result);
            System.err.println("Represented by the crab, Cancer seamlessly weaves between the sea and shore representing Cancer’s ability to exist in both emotional and material realms. \nCancers are highly intuitive and their psychic abilities manifest in tangible spaces. But—just like the hard-shelled crustaceans—this water sign is willing to do whatever it takes to protect itself emotionally." +
                    "\nIn order to get to know this sign, you're going to need to establish trust!");
        } else if (month == 7 && day >= 23) {
            result = "Leo";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    ************************   ");
            System.out.println("\t\t\t**                           **");
            System.out.println("\t\t\t**                           **");
            System.out.println("\t\t\t**       **********          **");
            System.out.println("\t\t\t**       **       **         **");
            System.out.println("\t\t\t**       **       **         **");
            System.out.println("\t\t\t**       **       **         **");
            System.out.println("\t\t\t**       **       **   ***   **");
            System.out.println("\t\t\t**   ****         *****      **");
            System.out.println("\t\t\t**  *    *                   **");
            System.out.println("\t\t\t**   ****                    **");
            System.out.println("\t\t\t**                           **");
            System.out.println("\t\t\t    ************************   ");
            System.out.println();
            System.err.println("\t\t     Your zodiac sign is " + result);
            System.err.println("Roll out the red carpet because Leo has arrived. \nPassionate, loyal, and infamously dramatic, Leo is represented by the lion and these spirited fire signs are the kings and queens of the celestial jungle." +
                    "\nThey're delighted to embrace their royal status: Vivacious, theatrical, and fiery, Leos love to bask in the spotlight and celebrate… well, themselves.");
        } else if (month == 8 && day <= 22) {
            result = "Leo";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    ************************   ");
            System.out.println("\t\t\t**                           **");
            System.out.println("\t\t\t**                           **");
            System.out.println("\t\t\t**       **********          **");
            System.out.println("\t\t\t**       **       **         **");
            System.out.println("\t\t\t**       **       **         **");
            System.out.println("\t\t\t**       **       **         **");
            System.out.println("\t\t\t**       **       **   ***   **");
            System.out.println("\t\t\t**   ****         *****      **");
            System.out.println("\t\t\t**  *    *                   **");
            System.out.println("\t\t\t**   ****                    **");
            System.out.println("\t\t\t**                           **");
            System.out.println("\t\t\t    ************************   ");
            System.out.println();
            System.err.println("\t\t     Your zodiac sign is " + result);
            System.err.println("Roll out the red carpet because Leo has arrived. \nPassionate, loyal, and infamously dramatic, Leo is represented by the lion and these spirited fire signs are the kings and queens of the celestial jungle." +
                    "\nThey're delighted to embrace their royal status: Vivacious, theatrical, and fiery, Leos love to bask in the spotlight and celebrate… well, themselves.");
        } else if (month == 8 && day >= 23) {
            result = "Virgo";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    ****************************   ");
            System.out.println("\t\t\t**                                **");
            System.out.println("\t\t\t**       ******   ****            **");
            System.out.println("\t\t\t**       **  **   ****            **");
            System.out.println("\t\t\t**       **  ** **  **  **        **");
            System.out.println("\t\t\t**       **  **     ****   **     **");
            System.out.println("\t\t\t**       **  **     **     **     **");
            System.out.println("\t\t\t**       **  **     **     **     **");
            System.out.println("\t\t\t**       **  **     **   **       **");
            System.out.println("\t\t\t**                **  **          **");
            System.out.println("\t\t\t**             **      **         **");
            System.out.println("\t\t\t**                                **");
            System.out.println("\t\t\t    ****************************   ");
            System.out.println();
            System.err.println("\t\t     Your zodiac sign is " + result);
            System.err.println("You know the expression, \"if you want something done, give it to a busy person?\" Well, that definitely is the Virgo anthem. \nVirgos are logical, practical, and systematic in their approach to life. Virgo is an earth sign historically represented by the goddess of wheat and agriculture, an association that speaks to Virgo's deep-rooted presence in the material world." +
                    "\nThis earth sign is a perfectionist at heart and isn’t afraid to improve skills through diligent and consistent practice.");
        } else if (month == 9 && day <= 23) {
            result = "Virgo";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    ****************************   ");
            System.out.println("\t\t\t**                                **");
            System.out.println("\t\t\t**       ******   ****            **");
            System.out.println("\t\t\t**       **  **   ****            **");
            System.out.println("\t\t\t**       **  ** **  **  **        **");
            System.out.println("\t\t\t**       **  **     ****   **     **");
            System.out.println("\t\t\t**       **  **     **     **     **");
            System.out.println("\t\t\t**       **  **     **     **     **");
            System.out.println("\t\t\t**       **  **     **   **       **");
            System.out.println("\t\t\t**                **  **          **");
            System.out.println("\t\t\t**             **      **         **");
            System.out.println("\t\t\t**                                **");
            System.out.println("\t\t\t    ****************************   ");
            System.out.println();
            System.err.println("\t\t     Your zodiac sign is " + result);
            System.err.println("You know the expression, \"if you want something done, give it to a busy person?\" Well, that definitely is the Virgo anthem. \nVirgos are logical, practical, and systematic in their approach to life. Virgo is an earth sign historically represented by the goddess of wheat and agriculture, an association that speaks to Virgo's deep-rooted presence in the material world." +
                    "\nThis earth sign is a perfectionist at heart and isn’t afraid to improve skills through diligent and consistent practice.");
        } else if (month == 9 && day >= 24) {
            result = "Libra";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    ******************   ");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t**         **           **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**   ****       ****    **");
            System.out.println("\t\t\t**   ***************    **");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t    ******************   ");
            System.out.println();
            System.err.println("\t\t     Your zodiac sign is " + result);
            System.err.println("Balance, harmony, and justice define Libra energy. \nAs a cardinal air sign, Libra is represented by the scales (interestingly, the only inanimate object of the zodiac), an association that reflects Libra's fixation on establishing equilibrium." +
                    "\nLibra is obsessed with symmetry and strives to create equilibrium in all areas of life — especially when it comes to matters of the heart.");
        } else if (month == 10 && day <= 23) {
            result = "Libra";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    ******************   ");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t**         **           **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**   ****       ****    **");
            System.out.println("\t\t\t**   ***************    **");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t    ******************   ");
            System.out.println();
            System.err.println("\t\t     Your zodiac sign is " + result);
            System.err.println("Balance, harmony, and justice define Libra energy. \nAs a cardinal air sign, Libra is represented by the scales (interestingly, the only inanimate object of the zodiac), an association that reflects Libra's fixation on establishing equilibrium." +
                    "\nLibra is obsessed with symmetry and strives to create equilibrium in all areas of life — especially when it comes to matters of the heart.");
        } else if (month == 10 && day >= 24) {
            result = "Scorpio";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    ****************************   ");
            System.out.println("\t\t\t**                                 **");
            System.out.println("\t\t\t**       ******   ******           **");
            System.out.println("\t\t\t**       **  **   **  **           **");
            System.out.println("\t\t\t**       **  ** **    **           **");
            System.out.println("\t\t\t**       **   **      **           **");
            System.out.println("\t\t\t**       **   **      **     **    **");
            System.out.println("\t\t\t**       **   **      **     **    **");
            System.out.println("\t\t\t**       **   **      **     **    **");
            System.out.println("\t\t\t**                    **   **      **");
            System.out.println("\t\t\t**                      **         **");
            System.out.println("\t\t\t**                                 **");
            System.out.println("\t\t\t    ****************************   ");
            System.out.println();
            System.err.println("\t\t\t     Your zodiac sign is " + result);
            System.err.println("Elusive and mysterious, Scorpio is one of the most misunderstood signs of the zodiac. \nScorpio is a water sign that uses emotional energy as fuel, cultivating powerful wisdom through both the physical and unseen realms." +
                    "\nIn fact, Scorpio derives its extraordinary courage from its psychic abilities, which is what makes this sign one of the most complicated, dynamic signs of the zodiac.");
        } else if (month == 11 && day <= 22) {
            result = "Scorpio";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    ****************************   ");
            System.out.println("\t\t\t**                                 **");
            System.out.println("\t\t\t**       ******   ******           **");
            System.out.println("\t\t\t**       **  **   **  **           **");
            System.out.println("\t\t\t**       **  ** **    **           **");
            System.out.println("\t\t\t**       **   **      **           **");
            System.out.println("\t\t\t**       **   **      **     **    **");
            System.out.println("\t\t\t**       **   **      **     **    **");
            System.out.println("\t\t\t**       **   **      **     **    **");
            System.out.println("\t\t\t**                    **   **      **");
            System.out.println("\t\t\t**                      **         **");
            System.out.println("\t\t\t**                                 **");
            System.out.println("\t\t\t    ****************************   ");
            System.out.println();
            System.err.println("\t\t\t     Your zodiac sign is " + result);
            System.err.println("Elusive and mysterious, Scorpio is one of the most misunderstood signs of the zodiac. \nScorpio is a water sign that uses emotional energy as fuel, cultivating powerful wisdom through both the physical and unseen realms." +
                    "\nIn fact, Scorpio derives its extraordinary courage from its psychic abilities, which is what makes this sign one of the most complicated, dynamic signs of the zodiac.");
        } else if (month == 11 && day >= 23) {
            result = "Sagittarius";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    *******************   ");
            System.out.println("\t\t\t**                       **");
            System.out.println("\t\t\t**                *      **");
            System.out.println("\t\t\t**               **      **");
            System.out.println("\t\t\t**              **       **");
            System.out.println("\t\t\t**          ** ** **     **");
            System.out.println("\t\t\t**           **          **");
            System.out.println("\t\t\t**         **            **");
            System.out.println("\t\t\t**  ************         **");
            System.out.println("\t\t\t**      **               **");
            System.out.println("\t\t\t**    **                 **");
            System.out.println("\t\t\t**                       **");
            System.out.println("\t\t\t    *******************   ");
            System.out.println();
            System.err.println("\t\t\t     Your zodiac sign is " + result);
            System.err.println("Oh, the places Sagittarius goes! But… actually. This fire sign knows no bounds. \nRepresented by the archer, Sagittarians are always on a quest for knowledge." +
                    "\nThe last fire sign of the zodiac, Sagittarius launches its many pursuits like blazing arrows, chasing after geographical, intellectual, and spiritual adventures.");
        } else if (month == 12 && day <= 21) {
            result = "Sagittarius";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    *******************   ");
            System.out.println("\t\t\t**                       **");
            System.out.println("\t\t\t**                *      **");
            System.out.println("\t\t\t**               **      **");
            System.out.println("\t\t\t**              **       **");
            System.out.println("\t\t\t**          ** ** **     **");
            System.out.println("\t\t\t**           **          **");
            System.out.println("\t\t\t**         **            **");
            System.out.println("\t\t\t**  ************         **");
            System.out.println("\t\t\t**      **               **");
            System.out.println("\t\t\t**    **                 **");
            System.out.println("\t\t\t**                       **");
            System.out.println("\t\t\t    *******************   ");
            System.out.println();
            System.err.println("\t\t\t     Your zodiac sign is " + result);
            System.err.println("Oh, the places Sagittarius goes! But… actually. This fire sign knows no bounds. \nRepresented by the archer, Sagittarians are always on a quest for knowledge." +
                    "\nThe last fire sign of the zodiac, Sagittarius launches its many pursuits like blazing arrows, chasing after geographical, intellectual, and spiritual adventures.");
        } else if (month == 12 && day >= 22) {
            result = "Capricorn";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    *****************************   ");
            System.out.println("\t\t\t**                                **");
            System.out.println("\t\t\t**   ****       ****              **");
            System.out.println("\t\t\t**     **      **  **             **");
            System.out.println("\t\t\t**         ** **   **             **");
            System.out.println("\t\t\t**         **      **             **");
            System.out.println("\t\t\t**         **      **             **");
            System.out.println("\t\t\t**         **      **             **");
            System.out.println("\t\t\t**         **      **   ***       **");
            System.out.println("\t\t\t**                    ***  ***    **");
            System.out.println("\t\t\t**                   ** ***       **");
            System.out.println("\t\t\t**               ****             **");
            System.out.println("\t\t\t**                                **");
            System.out.println("\t\t\t    ****************************=   ");
            System.out.println();
            System.err.println("\t\t\t     Your zodiac sign is " + result);
            System.err.println("What is the most valuable resource? For Capricorn, the answer is clear: Time. \nCapricorn is climbing the mountain straight to the top and knows that patience, perseverance, and dedication is the only way to scale." +
                    "\nThe last earth sign of the zodiac, Capricorn, is represented by the sea-goat, a mythological creature with the body of a goat and the tail of a fish. \nAccordingly, Capricorns are skilled at navigating both the material and emotional realms.");
        } else if (month == 1 && day <= 20) {
            result = "Capricorn";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    *****************************   ");
            System.out.println("\t\t\t**                                **");
            System.out.println("\t\t\t**   ****       ****              **");
            System.out.println("\t\t\t**     **      **  **             **");
            System.out.println("\t\t\t**         ** **   **             **");
            System.out.println("\t\t\t**         **      **             **");
            System.out.println("\t\t\t**         **      **             **");
            System.out.println("\t\t\t**         **      **             **");
            System.out.println("\t\t\t**         **      **   ***       **");
            System.out.println("\t\t\t**                    ***  ***    **");
            System.out.println("\t\t\t**                   ** ***       **");
            System.out.println("\t\t\t**               ****             **");
            System.out.println("\t\t\t**                                **");
            System.out.println("\t\t\t    ****************************=   ");
            System.out.println();
            System.err.println("\t\t\t     Your zodiac sign is " + result);
            System.err.println("What is the most valuable resource? For Capricorn, the answer is clear: Time. \nCapricorn is climbing the mountain straight to the top and knows that patience, perseverance, and dedication is the only way to scale." +
                    "\nThe last earth sign of the zodiac, Capricorn, is represented by the sea-goat, a mythological creature with the body of a goat and the tail of a fish. \nAccordingly, Capricorns are skilled at navigating both the material and emotional realms.");
        } else if (month == 1 && day >= 21) {
            result = "Aquarius";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    ************************   ");
            System.out.println("\t\t\t**                            **");
            System.out.println("\t\t\t**                            **");
            System.out.println("\t\t\t**     **     **      **      **");
            System.out.println("\t\t\t**   ** **  **  **  **  **    **");
            System.out.println("\t\t\t**  **    **     **      **   **");
            System.out.println("\t\t\t**                            **");
            System.out.println("\t\t\t**                            **");
            System.out.println("\t\t\t    ************************   ");
            System.out.println();
            System.err.println("\t\t\t     Your zodiac sign is " + result);
            System.err.println("Despite the \"aqua\" in its name, Aquarius is actually the last air sign of the zodiac. \nInnovative, progressive, and shamelessly revolutionary, Aquarius is represented by the water bearer, the mystical healer who bestows water, or life, upon the land." +
                    "\nAccordingly, Aquarius is the most humanitarian astrological sign. At the end of the day, Aquarius is dedicated to making the world a better place.");
        } else if (month == 2 && day <= 18) {
            result = "Aquarius";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    ************************   ");
            System.out.println("\t\t\t**                            **");
            System.out.println("\t\t\t**                            **");
            System.out.println("\t\t\t**     **     **      **      **");
            System.out.println("\t\t\t**   ** **  **  **  **  **    **");
            System.out.println("\t\t\t**  **    **     **      **   **");
            System.out.println("\t\t\t**                            **");
            System.out.println("\t\t\t**                            **");
            System.out.println("\t\t\t    ************************   ");
            System.out.println();
            System.err.println("\t\t\t     Your zodiac sign is " + result);
            System.err.println("Despite the \"aqua\" in its name, Aquarius is actually the last air sign of the zodiac. \nInnovative, progressive, and shamelessly revolutionary, Aquarius is represented by the water bearer, the mystical healer who bestows water, or life, upon the land." +
                    "\nAccordingly, Aquarius is the most humanitarian astrological sign. At the end of the day, Aquarius is dedicated to making the world a better place.");
        } else if (month == 2 && day >= 19) {
            result = "Pisces";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    ******************   ");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t**    ***       ***     **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**    *************     **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**    ***       ***     **");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t    ******************   ");
            System.out.println();
            System.err.println("\t\t\t     Your zodiac sign is " + result);
            System.err.println("If you looked up the word \"psychic\" in the dictionary, there would definitely be a picture of Pisces next to it. \nPisces is the most intuitive, sensitive, and empathetic sign of the entire zodiac — and that’s because it’s the last of the last." +
                    "\nAAs the final sign, Pisces has absorbed every lesson — the joys and the pain, the hopes and the fears — learned by all of the other signs. \nIt's symbolized by two fish swimming in opposite directions, representing the constant division of Pisces' attention between fantasy and reality.");
        } else if (month == 3 && day <= 20) {
            result = "Pisces";
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t    ******************   ");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t**    ***       ***     **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**    *************     **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**       **   **        **");
            System.out.println("\t\t\t**    ***       ***     **");
            System.out.println("\t\t\t**                      **");
            System.out.println("\t\t\t    ******************   ");
            System.out.println();
            System.err.println("\t\t\t     Your zodiac sign is " + result);
            System.err.println("If you looked up the word \"psychic\" in the dictionary, there would definitely be a picture of Pisces next to it. \nPisces is the most intuitive, sensitive, and empathetic sign of the entire zodiac — and that’s because it’s the last of the last." +
                    "\nAAs the final sign, Pisces has absorbed every lesson — the joys and the pain, the hopes and the fears — learned by all of the other signs. \nIt's symbolized by two fish swimming in opposite directions, representing the constant division of Pisces' attention between fantasy and reality.");
        } else {
            System.err.println("Invalid Entry");
        }

        // DETERMINE THE TOPIC
        System.out.println();
        System.out.println("Would you like to know about your future? \n" +
                "1-) Love \n2-) Money \n3-) Health\n" +
                "Enter the number of the relevant topic title.");
        System.out.println("Valid Entry: 1-3:");
        int topic = scan.nextInt();
        if (!(topic > 0 && topic < 4)) {
            System.err.println("Invalid Entry");
            System.out.println();
            System.out.println();
            logo();
            goodbyeMessage();
            System.exit(0);
        }

        // DETERMINE THE TOPIC - LOVE
        if (topic == 1) {
            System.out.println("Would you like to see the zodiac signs compatible with your zodiac sign?");
            System.out.println("Valid Entry: Yes-No:");
            String loveAnswer = scan.next();
            if (!(loveAnswer.equalsIgnoreCase("Yes") || loveAnswer.equalsIgnoreCase("No"))) {
                System.err.println("Invalid Entry");
                System.out.println();
                System.out.println();
                logo();
                goodbyeMessage();
                System.exit(0);
            } else if (loveAnswer.equalsIgnoreCase("No")) {

                if (result.equals("Aries")) {
                    System.out.println("Get ready for a year of sexual healing, Aries. " +
                            "\nMany of the planetary trends focus upon the past, which can make you especially reflective on how you’ve approached your intimacy and relationships in recent years. " +
                            "\nYou will have intense reawakenings about how you wish to find someone who will connect with you on the deepest of levels.");
                } else if (result.equals("Taurus")) {
                    System.out.println("Oh, love. My heart goes out to you because we are on such an intense journey in 2022 and I cannot lie to you. " +
                            "\nYou have been so focused on your ambitions that you’ve sacrificed your friendships and relationships — believing that you’ll be stronger if you put your heart into your plans because they’ll never leave you, even when people sometimes do. " +
                            "\nBut 2022 will make you look in the mirror and ask yourself what you truly want in your relationships and what you need to fix to be healed.");
                } else if (result.equals("Gemini")) {
                    System.out.println("In recent years, you’ve focused on stepping into this new version of yourself — fighting skin and bone to emerge free. " +
                            "\nYou are unafraid of love, but you know your limits and they always must be on your terms going forward." +
                            "\nYou will spend a great deal of time in 2022 focusing on how people perceive you and whether you’re happy with this new version of yourself because it’s different than what people expected");
                } else if (result.equals("Cancer")) {
                    System.out.println("The new year is like the moment you fade from reality into a dream, Cancer. You will consistently wonder how you lucked out to fall this deeply.  " +
                            "\nAll of your relationships will flourish, but you’ll realize that you’re on a whole new journey when it comes to your heart. Life will continue to show you that you can trust more than you ever thought you could." +
                            "\nPassion, laughter and friendship will surround you — and you’ll realize that your very special magic is being recognized by everyone around you, too. ");
                } else if (result.equals("Leo")) {
                    System.out.println("You have been doing the heavy lifting in your relationships for quite some time, Leo. You’ve wondered if this is a pattern that will continue — and, yes, it will.  " +
                            "\nThe karma and baggage you are holding onto are worth it, though, if you know how to also get your needs met." +
                            "\n2022 could provide you the confidence to speak up and ask for what you need.");
                } else if (result.equals("Virgo")) {
                    System.out.println("Love is written in the stars and for you, dear Virgo, you are finally seeing the light." +
                            "\nThe year to come will smile on you like you’ve finally found the spark of fire inside your heart again." +
                            "\nAll of your relationships will flourish — and the best part about 2022 is that your love could lead you in vast new directions with travel or if single, you may even be interested in someone from a different background, culture or country! ");
                } else if (result.equals("Libra")) {
                    System.out.println("Romance is a lifestyle, Libra. The key to making it a habit is prioritizing it." +
                            "\nHowever, 2022 could end up focusing you more on your responsibilities, family and work life, rather than the sparks of love.");
                } else if (result.equals("Scorpio")) {
                    System.out.println("Imagine a dark sky of clouds that crackle with lightning. That image can be fearful — but it is also powerful.  " +
                            "\nYou are standing in that sky with lightning obeying your command. In 2022, you will find that love is not luck — it is your birthright. " +
                            "\nYou are a thunder god now, and gods should be obeyed. You will choose to make your greatest love story come to you.");
                } else if (result.equals("Sagittarius")) {
                    System.out.println("After years of dramatic change, now you are ready to explore and settle into this new rhythm.  " +
                            "\nWhile home and family will certainly dominate your attention and you could heal some of the issues, you’ll also be focused on following your own plan rather than anyone else’s.  " +
                            "\n2022 is also screaming something else: adventure. You’ve learned so much bull about relationships that it’s time for passion and new beginnings.");
                } else if (result.equals("Capricorn")) {
                    System.out.println("The past is a rose. It is beautiful to behold, but it has thorns — you can admire it from a distance but you can’t grip it without bleeding. " +
                            "\nThe past is meant to teach you that some things grow more exquisite when you look back over time. " +
                            "\nBut you cannot ever recreate it; otherwise, it will repeat the pain you felt. Plant that rose of your past in your garden of life.");
                } else if (result.equals("Aquarius")) {
                    System.out.println("You’ve made important choices about your independence and power and the ramifications will echo out further." +
                            "\nIn 2022, you’re focusing on your self-love and personal worth. That doesn’t mean you will be alone: the universe is dancing with love for you, especially around your past, your family and friends." +
                            "\nFinding new love for singles may not be as easy, but you will never be alone.");
                } else {
                    System.out.println("Imagine rowing a boat that finally hits the sand. You step out and you see a whole new world is open for you to explore." +
                            "\nThat is your 2022. It is a whole new era of you, except different, brighter, exotic and in a whole new direction." +
                            "\nThis will reflect in your love life.");
                }


                System.out.println();
                System.out.println();
                System.out.println();
                logo();
                System.out.println();
                goodbyeMessage();
                System.exit(0);
            } else {
                if (result.equals("Aries")) {
                    System.out.println("Get ready for a year of sexual healing, Aries. " +
                            "\nMany of the planetary trends focus upon the past, which can make you especially reflective on how you’ve approached your intimacy and relationships in recent years. " +
                            "\nYou will have intense reawakenings about how you wish to find someone who will connect with you on the deepest of levels.");
                    System.out.println();
                    System.out.println("*** Sagittarius and Aquarius are compatible with your zodiac sign. ***");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    logo();
                    System.out.println();
                    goodbyeMessage();
                    System.exit(0);
                } else if (result.equals("Taurus")) {
                    System.out.println("Oh, love. My heart goes out to you because we are on such an intense journey in 2022 and I cannot lie to you. " +
                            "\nYou have been so focused on your ambitions that you’ve sacrificed your friendships and relationships — believing that you’ll be stronger if you put your heart into your plans because they’ll never leave you, even when people sometimes do. " +
                            "\nBut 2022 will make you look in the mirror and ask yourself what you truly want in your relationships and what you need to fix to be healed.");
                    System.out.println();
                    System.out.println("*** Cancer and Scorpio are compatible with your zodiac sign. ***");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    logo();
                    System.out.println();
                    goodbyeMessage();
                    System.exit(0);
                } else if (result.equals("Gemini")) {
                    System.out.println("In recent years, you’ve focused on stepping into this new version of yourself — fighting skin and bone to emerge free. " +
                            "\nYou are unafraid of love, but you know your limits and they always must be on your terms going forward." +
                            "\nYou will spend a great deal of time in 2022 focusing on how people perceive you and whether you’re happy with this new version of yourself because it’s different than what people expected");
                    System.out.println();
                    System.out.println("*** Aquarius and Sagittarius are compatible with your zodiac sign. ***");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    logo();
                    System.out.println();
                    goodbyeMessage();
                    System.exit(0);
                } else if (result.equals("Cancer")) {
                    System.out.println("The new year is like the moment you fade from reality into a dream, Cancer. You will consistently wonder how you lucked out to fall this deeply.  " +
                            "\nAll of your relationships will flourish, but you’ll realize that you’re on a whole new journey when it comes to your heart. Life will continue to show you that you can trust more than you ever thought you could." +
                            "\nPassion, laughter and friendship will surround you — and you’ll realize that your very special magic is being recognized by everyone around you, too. ");
                    System.out.println();
                    System.out.println("*** Leo and Taurus are compatible with your zodiac sign. ***");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    logo();
                    System.out.println();
                    goodbyeMessage();
                    System.exit(0);
                } else if (result.equals("Leo")) {
                    System.out.println("You have been doing the heavy lifting in your relationships for quite some time, Leo. You’ve wondered if this is a pattern that will continue — and, yes, it will.  " +
                            "\nThe karma and baggage you are holding onto are worth it, though, if you know how to also get your needs met." +
                            "\n2022 could provide you the confidence to speak up and ask for what you need.");
                    System.out.println();
                    System.out.println(" *** Pisces and Libra are compatible with your zodiac sign. ***");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    logo();
                    System.out.println();
                    goodbyeMessage();
                    System.exit(0);
                } else if (result.equals("Virgo")) {
                    System.out.println("Love is written in the stars and for you, dear Virgo, you are finally seeing the light." +
                            "\nThe year to come will smile on you like you’ve finally found the spark of fire inside your heart again." +
                            "\nAll of your relationships will flourish — and the best part about 2022 is that your love could lead you in vast new directions with travel or if single, you may even be interested in someone from a different background, culture or country! ");
                    System.out.println();
                    System.out.println("*** Taurus and Capricorn are compatible with your zodiac sign. ***");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    logo();
                    System.out.println();
                    goodbyeMessage();
                    System.exit(0);
                } else if (result.equals("Libra")) {
                    System.out.println("Romance is a lifestyle, Libra. The key to making it a habit is prioritizing it." +
                            "\nHowever, 2022 could end up focusing you more on your responsibilities, family and work life, rather than the sparks of love.");
                    System.out.println();
                    System.out.println("*** Aquarius and Taurus are compatible with your zodiac sign. ***");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    logo();
                    System.out.println();
                    goodbyeMessage();
                    System.exit(0);
                } else if (result.equals("Scorpio")) {
                    System.out.println("Imagine a dark sky of clouds that crackle with lightning. That image can be fearful — but it is also powerful.  " +
                            "\nYou are standing in that sky with lightning obeying your command. In 2022, you will find that love is not luck — it is your birthright. " +
                            "\nYou are a thunder god now, and gods should be obeyed. You will choose to make your greatest love story come to you.");
                    System.out.println();
                    System.out.println("*** Virgo and Pisces are compatible with your zodiac sign. ***");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    logo();
                    System.out.println();
                    goodbyeMessage();
                    System.exit(0);
                } else if (result.equals("Sagittarius")) {
                    System.out.println("After years of dramatic change, now you are ready to explore and settle into this new rhythm.  " +
                            "\nWhile home and family will certainly dominate your attention and you could heal some of the issues, you’ll also be focused on following your own plan rather than anyone else’s.  " +
                            "\n2022 is also screaming something else: adventure. You’ve learned so much bull about relationships that it’s time for passion and new beginnings.");
                    System.out.println();
                    System.out.println("*** Sagittarius and Aquarius are compatible with your zodiac sign. ***");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    logo();
                    System.out.println();
                    goodbyeMessage();
                    System.exit(0);
                } else if (result.equals("Capricorn")) {
                    System.out.println("The past is a rose. It is beautiful to behold, but it has thorns — you can admire it from a distance but you can’t grip it without bleeding. " +
                            "\nThe past is meant to teach you that some things grow more exquisite when you look back over time. " +
                            "\nBut you cannot ever recreate it; otherwise, it will repeat the pain you felt. Plant that rose of your past in your garden of life.");
                    System.out.println();
                    System.out.println("*** Cancer and Taurus are compatible with your zodiac sign. ***");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    logo();
                    System.out.println();
                    goodbyeMessage();
                    System.exit(0);
                } else if (result.equals("Aquarius")) {
                    System.out.println("You’ve made important choices about your independence and power and the ramifications will echo out further." +
                            "\nIn 2022, you’re focusing on your self-love and personal worth. That doesn’t mean you will be alone: the universe is dancing with love for you, especially around your past, your family and friends." +
                            "\nFinding new love for singles may not be as easy, but you will never be alone.");
                    System.out.println();
                    System.out.println("*** Gemini and Libra are compatible with your zodiac sign. ***");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    logo();
                    System.out.println();
                    goodbyeMessage();
                    System.exit(0);
                } else {
                    System.out.println("Imagine rowing a boat that finally hits the sand. You step out and you see a whole new world is open for you to explore." +
                            "\nThat is your 2022. It is a whole new era of you, except different, brighter, exotic and in a whole new direction." +
                            "\nThis will reflect in your love life.");
                    System.out.println();
                    System.out.println("*** Scorpio and Aries are compatible with your zodiac sign. ***");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    logo();
                    System.out.println();
                    goodbyeMessage();
                    System.exit(0);
                }
            }

            // DETERMINE THE TOPIC - MONEY
        } else if (topic == 2) {
            System.out.println("Do you prefer to follow long-term or short-term financial trends?");
            System.out.println("Valid Enters: 1-2");
            System.out.println("1-)Long-term\n2-)Short-term");
            int answer2 = scan.nextInt();
            if (!(answer2 > 0 && answer2 < 3)) {
                System.err.println("Invalid Entry");
                System.out.println();
                System.out.println();
                logo();
                System.out.println();
                goodbyeMessage();

            }

            if (answer2 == 1) { // Long Term Financial Trends
                switch (result) {
                    case "Aries":
                        astro_sign = "Aries-It’s time to get real about your financial future, Aries! " + "\n" +
                                "Act now, think later is practically your life motto but this is not the year for rash decisions. " + "\n" +
                                "What it is, however, is the ideal year to let go of old ideas about what you’re worth. " + "\n" +
                                "It’s time to step into an independent, successful and self-sustaining future, Aries – " + "\n" +
                                "and the stars are aligned for just that. Your cosmic financial axis looks lit in 2022 with " + "\n" +
                                "unexpected windfalls and more than one lucky break on the cards. Put the work in this September" + "\n" +
                                " and you’ll be toasting a big career win by the end of the year. \n" + "\n" +
                                "Manifest it: Set intentions on the 30 April new moon eclipse.\n" +
                                "Make bank: Your luck is in from mid May to late October. \n" +
                                "Don’t be surprised if… Going it alone turns out to be the answer to your financial problems.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Taurus":
                        astro_sign = "Taurus-Sick of waiting it out till pay day? Ready to live the life of luxury you know " + "\n" +
                                "you deserve? We hear you, Taurus! A major change in your career or job status could provide " + "\n" +
                                "the key to long-term financial stability in 2022. Don’t be afraid to move on, ask for more or " + "\n" +
                                "refuse to be taken for granted as the year plays out. A tricky period over the summer could see " + "\n" +
                                "you hiding in the shadows while the sun shines. Use the time out to get clear about what matters " + "\n" +
                                "most to you and be bold with your next steps. A financial plan or investment made in June could pay " + "\n" +
                                "off in time for Christmas. \n" + "\n" +
                                "Manifest it: Set financial goals on the 30 May new moon.\n" +
                                "Make bank: Expect a big career decision to pay off.\n" +
                                "Don’t be surprised if… You have to speculate to accumulate in 2022.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Gemini":
                        astro_sign = "Gemini-Don’t expect a cash bonus to fall into your lap in 2022, Gemini, " + "\n" +
                                "but do know that you can get what you want if you work for it. Your luck is in when it" + "\n" +
                                " comes to career success this year so don’t be surprised if you strike gold with a job" + "\n" +
                                " offer or business proposal. After a dramatic couple of years you’ve learnt to prioritise" + "\n" +
                                " your wellbeing no matter how urgent the work email – stand your ground on that one and you’ll" + "\n" +
                                " go far this year too. This summer could see you on the receiving end of a surprise windfall or" + "\n" +
                                " sealing a thrilling financial deal at work.  " + "\n" +
                                "Manifest it: Think big and then think bigger on the 29 June new moon.\n" +
                                "Make bank: Your cash flow should look healthier by July.\n" +
                                "Don’t be surprised if… You receive a surprise investment in a big idea this summer.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Cancer":
                        astro_sign = "Cancer-Your financial situation is on the up, Cancer, even if it doesn’t feel that way " + "\n" +
                                "right this second! Surprise deals, networking luck and lucrative link ups (#powercouplevibes) " + "\n" +
                                "could all send your bank balance soaring as 2022 hits its stride, but it’s a project you embark " + "\n" +
                                "on solo that holds the key to your financial future. Be brave enough to step into the spotlight " + "\n" +
                                "this year – the results will soon show up in your wallet. Make a career move that promises to pay" + "\n" +
                                " more this summer and you’ll be flying high before the year is out.\n" +
                                "\n" + "Manifest it: Set a ‘sky’s the limit’ money goal on the 28 July new moon.\n" +
                                "Make bank: Expect a February windfall.\n" +
                                "Don’t be surprised if… A new connection offers you a financial leg up in 2022.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Leo":
                        astro_sign = "Leo-A much-needed cash injection could fall into your lap in 2022, Leo –" + "\n" +
                                " think bonuses, windfalls or an unexpected inheritance. You could even find yourself " + "\n" +
                                "teaming up in love or business with someone whose money flows in all the right directions." + "\n" +
                                " Sounding good? It doesn’t mean you can put your feet up and count your piles of gold just yet. " + "\n" +
                                "You’ve got big career decisions to make in 2022 as you begin to transform every area of your life for good. \n" +
                                "\n" + "Manifest it: Start over with a money plan on the 27 August new moon.\n" +
                                "Make bank: A summer work trip could prove lucrative. \n" +
                                "Don’t be surprised if… It feels like the right time to quit the day job.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Virgo":
                        astro_sign = "Virgo-It’s a good job you’re not afraid of hard work, Virgo, " + "\n" +
                                "because the cosmos could turn out to be one hell of a demanding boss in 2022. " + "\n" +
                                "Your big ker-ching moment is coming but you’ll have to put the hours in first. " + "\n" +
                                "There’s no time like the present! Whatever you do, don’t quit a passion project or " + "\n" +
                                "resign a big idea to the scrap heap in 2022. Keep going and your pay off should arrive by autumn. " + "\n" +
                                "Expanding your knowledge or learning a new skill could also prove lucrative this year. " + "\n" +
                                "Save for a rainy day as 2022 begins but don’t be afraid to invest in yourself as the year plays out.\n" +
                                "\n" + "Manifest it: The 25 September new moon is money magic in action for Virgo.\n" +
                                "Make bank: A summer windfall could buy you a magical sense of freedom. \n" +
                                "Don’t be surprised if… You find yourself working harder than ever in 2022.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Libra":
                        astro_sign = "Libra-Everything you touch has the potential to turn golden in 2022, " + "\n" +
                                "Libra, so choose a path you can imagine walking in the long term. Time spent on a personal " + "\n" +
                                "project or side hustle could prove your wisest investment this year as the cosmos urges you " + "\n" +
                                "to put your energy where your passion is. Your financial axis is in focus as the year marches on," + "\n" +
                                " inviting you to know your worth and expect more in all areas of your life. You deserve the best, Libra." + "\n" +
                                "Manifest it: Ask the universe for the cash injection you need on the 30 April new moon eclipse.\n" +
                                "Make bank: Your bank balance should look spectacular by November.\n" +
                                "Don’t be surprised if… Doing what you love brings great rewards in 2022.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Scorpio":
                        astro_sign = "Scorpio-Building a nest egg or legacy remains a major financial theme for you in 2022, Scorpio." + "\n" +
                                " If your commitment to a savings plan has slipped lately, the start of the year is the ideal time to " + "\n" +
                                "get things back on track. It’s not all sensible bean counting in 2022, though. " + "\n" +
                                "There’s transformational magic in the air for you this year, the kind that could even involve a significant " + "\n" +
                                "– and well paid – spell in the spotlight! A switch up in your daily routine could pay off over the summer " + "\n" +
                                "and good news around the 14 June full moon could see you laughing all the way to the bank.\n" +
                                "\n" + "Manifest it: Set new financial goals on the 23 November new moon.\n" +
                                "Make bank: You should find yourself feeling flush this summer. \n" +
                                "Don’t be surprised if… Good money news comes from unexpected places in 2022.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Sagittarius":
                        astro_sign = "Sagittarius-Your finances could well transform for the better in 2022, Sagittarius. " + "\n" +
                                "And if you’ve been wondering when you’ll ever make it on to the property ladder you might just" + "\n" +
                                " find your luck is in this year. There are changes to your work life and daily routine ahead in 2022, too." + "\n" +
                                " Think knuckling down, really committing to a plan and pressing pause on your wanderlust for the time being. " + "\n" +
                                "You’re stepping it up in all parts of your life, Sag, and the impact on your finances could be life-changing." + "\n" +
                                " \n" + "\n" + "Manifest it: A New Year’s resolution or goal is set to come good this year.  \n" +
                                "Make bank: A plan made around the 29 June new moon could create a pleasing passive income stream.\n" +
                                "Don’t be surprised if… Slow and steady wins the money race for Sagittarius in 2022.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Capricorn":
                        astro_sign = "Capricorn-Money has always made the world go round for you, Capricorn, and there should be plenty of " + "\n" +
                                "it coming your way in 2022. There could be plenty of attention headed your way this year, too – " +
                                "whether you like it or not. Your instincts are on fire right now so follow your intuition when it comes " + "\n" +
                                "to contracts, deals and promotions. And don’t accept the first offer – ever! A happy change in personal " + "\n" +
                                "circumstances (the birth of a new project or even a child?) could see you switching things up to create " + "\n" +
                                "a better future this year. Either way, you’ll be in a better position by the end of 2022 than you are " + "\n" +
                                "at the start.\n" + "\n" +
                                "Manifest it: A plan made on the 1 February new moon has money magic written all over it. \n" +
                                "Make bank: A summer windfall or bonus could buy you the freedom you crave. \n" +
                                "Don’t be surprised if… A slow burn investment becomes lucrative this summer. ";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Aquarius":
                        astro_sign = "Aquarius-Brace yourself for your best financial year yet, Aquarius." +
                                " Take it slow as 2022 begins and come up with a plan that prioritises your well-being as well as your" + "\n" +
                                " bank balance, because you’ll be spending big by the end of the year. This is a year to expect more, " + "\n" +
                                "know your worth and ask for what you really deserve. A pay rise, promotion or investment pay off could " + "\n" +
                                "change the way you feel about your future this spring. Ready for a career dream come true? You’ve got " + "\n" +
                                "one coming before the year is out.\n" + "\n" +
                                "Manifest it: Set investment intentions on the 2 March new moon.\n" +
                                "Make bank: Both your career and finances are looking lit this autumn.\n" +
                                "Don’t be surprised if… A status change brings money your way this year.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Pisces":
                        astro_sign = "Pisces-You’ve got luck on your side this year, Pisces, and your finances should feel the" + "\n" +
                                " benefit this summer. Of course, this might mean swapping your lazy vacancy fantasy for digital" + "\n" +
                                " nomad deadlines but we promise the pay off will be worth it. Keep going on a side hustle or passion" + "\n" +
                                " project because magic awaits you if you do. Think dreams come true, well-deserved rewards and " + "\n" +
                                "finally getting the pay off you deserve. Financial success is yours in 2022, Pisces!\n" + "\n" + "\n" +
                                "Manifest it: Make a wish on the 1 April new moon. \n" +
                                "Make bank: Expect a serious cash injection (or the promise of one) this summer. \n" +
                                "Don’t be surprised if… Your biggest money fantasy comes true this year.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    default:
                        System.err.println("Invalid  Entry");
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        System.exit(0);
                }
            } else if (answer2 == 2) { // Short Term Financial Trends
                switch (result) {
                    case "Aries":
                        astro_sign = "The beginning of 2022 might be a bit tricky for you. There are chances of you getting infected or falling sick out of the blue. " +
                                "\nBut you will recover quickly. You will also be low on finances in the beginning but you will pick up, as the months go by.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Taurus":
                        astro_sign = "There will be chances of gaining good money and finance from unprecedented sources. " +
                                "\nYou may feel insecure about your comfortable lifestyle but it will last only for some time. " +
                                "\nYou will have an effective income this time.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Gemini":
                        astro_sign = "There will be growth in your finances, profession and work. " +
                                "\nYou will have a healthy lifestyle that will help you be active and have a positive mindset. " +
                                "\nYour finances will automatically grow.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Cancer":
                        astro_sign = "Your finances will radically grow this coming year. " +
                                "\nYou might spend more and save less at times, but you will be able to see a balance in both of these aspects soon. " +
                                "\nBut you still need to be careful about spending too much of your finances.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Leo":
                        astro_sign = "You are likely to face a difficult situation regarding your finances. " +
                                "\nThere will be a lot of confusion regarding your money accounts which will eventually lead you towards your downfall. " +
                                "\nWork towards reaching a definite conclusion instead of letting matters turn grey.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Virgo":
                        astro_sign = "2022 will be the year where you will be blessed with stable finances and wealth. " +
                                "\nYou will reach a balance where handling and spending your money will become easier. " +
                                "\nBut you’re likely to have a close-fisted nature with money.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Libra":
                        astro_sign = "You will be focusing on your health and fitness journey a lot in the upcoming year. " +
                                "\nAnd so, you might spend a lot on your health and fitness aspects. " +
                                "\nHowever, you might face some serious problems as well.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Scorpio":
                        astro_sign = "You are likely to overspend a lot this upcoming year. " +
                                "\nThis will decrease the chances of you saving up or earning enough money to lead a comfortable lifestyle. " +
                                "\nYou should pay special attention to your budget framework.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Sagittarius":
                        astro_sign = "You will be financially very strong and stable. " +
                                "\nYou won’t have to worry about receding income or excessive expenditure because you will have great faith within yourself that will eventually help you to succeed.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Capricorn":
                        astro_sign = "It will indeed be a lucky year for you since you will experience a spurt in the growth of your finances. " +
                                "\nYour wealth and earnings will increase, helping you to gain temporary or permanent success. " +
                                "\nYour fantastic health will allow you to work even harder.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Aquarius":
                        astro_sign = "Your finances may unexpectedly see a break in the pattern. " +
                                "\nYour expenditures might increase and your savings will decrease, causing great concern. " +
                                "\nHowever, with special consideration, it will leap right back into its original form, with just some effort.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Pisces":
                        astro_sign = "Your financial situation will grow at the beginning of 2022. " +
                                "\nIt will give you great joy to earn a substantial amount of money for you and your family. " +
                                "\nThere may be a fluctuation in your income here and there but be rest assured, you have a good financial year ahead.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    default:
                        System.err.println("Invalid  Entry");
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        System.exit(0);

                }
            }

            // DETERMINE THE TOPIC - HEALTH
        } else { // Health Section
            System.out.println("Do you have any ailments?");
            System.out.println("Valid Enters: Yes-No");
            String healthAnswer = scan.next();
            if (!(healthAnswer.equalsIgnoreCase("Yes") || healthAnswer.equalsIgnoreCase("No"))) {
                System.err.println("Invalid Entry");
                System.out.println();
                System.out.println();
                logo();
                System.out.println();
                goodbyeMessage();
                System.exit(0);
            } else if (healthAnswer.equals("No")) {
                switch (result) {
                    case "Aries":
                        astro_sign = "You are advised to stay cautious with your health. Do not take health lightly. Try to keep up with your health plan as you’re advised to keep health your priority! " +
                                "\nMake sure you cut down on eating unhealthy food, which could be one of the primary reasons for your deteriorating health. Eat homemade food and stick to healthy food only. " +
                                "\nIncrease the intake of vegetables and fruits during this time. Your habit of eating junk food may continue for a long time now, and you may also realise it.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Taurus":
                        astro_sign = "Married Natives need to be cautious regarding their parent’s wellbeing. Keep a constant check on their health. " +
                                "\nEnsure you also check if they have taken their medicines on time or missed any of their doctor’s appointments. " +
                                "\nIn case of any signs of weakness, or sickness make sure you consult the doctor immediately. " +
                                "\nIf a complete health check is recommended, seek it and don’t delay it even a bit.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Gemini":
                        astro_sign = "This year, health would need more attention than usual. Health needs to be kept a priority this year. " +
                                "\nUnder no circumstances should you ignore health, diet, and fitness in 2022. Any compromise on a diet, fitness can affect your health severely. " +
                                "\nSo be very careful. Also, monitor your health very carefully. The natives suffering from blood pressure, blood sugar problems, and lung-related issues should be extra cautious.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Cancer":
                        astro_sign = "Cancer Yearly Horoscope suggests that you take precautions against minor ailments, as you may feel under the weather while the weather changes. " +
                                "\nAlong with you, make sure to take care of your family’s health as this could be contagious. If the symptoms are minor, you can treat them at home. " +
                                "\nHowever, if it continues for more than three days, you are advised to consult the doctor. Make sure that you make a proper plan before you embark on your travel journey.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Leo":
                        astro_sign = "This year, almost all Leo peeps may enjoy their work and personal life the most, says their yearly health horoscope. " +
                                "\nThis is such a blessing for the Leo natives, an enviable factor for the other zodiac signs. " +
                                "\nTry to spend your weekend with your family, plan trips, vacations, dinners as they may feel wanted, loved, blessed, and memorable. " +
                                "\nMarried folks can do unique and cute things for their partner, like planning a surprise party, going on long drives, taking a long walk, or even planning a dinner for them.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Virgo":
                        astro_sign = "This year may prove excellent for matters related to your health, but your parent’s health may be a matter of concern. " +
                                "\nThis is the reason why you need to take additional care. Keep a constant check on their health. " +
                                "\nMake sure you check if they have taken their medicines on time. Take care of their doctor’s appointments as well. " +
                                "\nIn case of any signs of weakness, or sickness make sure you consult the doctor immediately. " +
                                "\nIf a complete health check is recommended, it is advised that you seek it and don’t delay it even a bit.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Libra":
                        astro_sign = "This year may be an excellent time to enjoy your health. " +
                                "\nYou have maintained your health by avoiding unhealthy eating habits, helping you achieve your fitness goals. " +
                                "\nIf you do not want to go to a gym, then you can try out fitness classes. It may be beneficial to lose weight, plus it may make you feel lively and cheerful, says your yearly horoscope. " +
                                "\nContinue with healthy habits, do not try to skip the efforts just because health is on track.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Scorpio":
                        astro_sign = "This yearly you are likely to be feeling slightly under the weather with an illness that does not appear to be ending, predicts your yearly horoscope. " +
                                "\nHence, it would help if you took care of your diet and exercise. It may not be those times where you get away by eating whatever you wish you to. " +
                                "\nIt is better to do away with lousy health habits before it takes your health down. Be very particular about your diet. " +
                                "\nIf the doctor has suggested you not eat certain food items, try to stay away from them and maintain the diet prescribed to you.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Sagittarius":
                        astro_sign = "This year you may need some out-of-the-box efforts to keep your health on track, says Sagittarius horoscope 2022 health. " +
                                "\nTry to keep fitness in mind, but try not to go overboard. Understand your body and listen to it. " +
                                "\nYou do not have to go to the gym, pick weights and build a bulk body. However, you have to make sure that fitness is maintained. " +
                                "\nAthletes your health is gonna be awesome throughout the year, with a regular exercise and fitness programme that makes it possible for you to work long and hard.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Capricorn":
                        astro_sign = "The positive influence of Saturn may increase your energy levels in the 1st half of 2022. According to the Capricorn 2022 health horoscope, diseases may not be of any concern. " +
                                "\nHowever, after November, you may face acute conditions or some unexpected illnesses. For some of the Capricorn, natives do not self-medicate as it may lead to complications. " +
                                "\nInstead, monitor your health very carefully. Try not to ignore any symptoms; consult with the doctor immediately if you face any issues.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Aquarius":
                        astro_sign = "For Aquarius folks, there may be a good balance of both work-life and personal life. This year you may need to focus mainly on your diet. Have a healthy diet, consume a lot of vegetables and fruits. " +
                                "\nInclude a lot of green leafy vegetables in your diet. Try to avoid eating oily food and food from outside often, as it may affect your health and may deviate from the health plan you have set for yourself. " +
                                "\nAlong with maintaining a healthy diet, you are also advised to stay away from a sedentary lifestyle.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Pisces":
                        astro_sign = "Pisces Health Horoscope 2022 predicts that it can be a stress-free year. There may not be any major issues, but you need to take good care of yourself. " +
                                "\nMake sure you drive carefully as there are odds of a mishap. Take a proper diet and maintain a healthy lifestyle schedule. " +
                                "\nPractice yoga and do some light exercises in the morning." +
                                "\nThis helps in keeping the health problems at bay. This year is going to be very good in terms of your health, says the Pisces 2022 health horoscope.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    default:
                        System.err.println("Invalid  Entry");
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        System.exit(0);
                }

            } else if(healthAnswer.equals("Yes")){
                switch (result) {
                    case "Aries":
                        astro_sign = "Aries is associated with our head, brain and face. Energetically third eye and crown chakra and ruled by Mars." +
                                "\nAries can tend to be hot headed because of which they could have mental stress that can lead to headaches, migraines, and strokes." +
                                "\nAries can also have hair fall challenges because of the stress they take on.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Taurus":
                        astro_sign = "Taurus is Associated with our neck, ears and throat. Energetically throat chakra." +
                                "\nOur throat chakra is responsible for any challenge related to our thyroid glad , ENT." +
                                "\nHence a Taurusean can have challenges like colds, sore throats, and earaches." +
                                "\nBecause it’s association with thyroid glad a Taurusean can have suddenly weight gain or loss as well.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Gemini":
                        astro_sign = "Gemini is a sign associated with our lungs, shoulders, arms and hands." +
                                "\nThe Heart chakra in short." +
                                "\nHence Gemini could have respiratory challenges, fever because of immunity challenges and their nervous system is also affected causing them anxiety.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Cancer":
                        astro_sign = "Cancer is Associated with breasts, chest and our stomach . Our heart chakra and our solar plexus chakra." +
                                "\nCancer being a sign that is extremely emotional, can be more prone to depression and can turn to food when they feel so which causes them digestive disorders." +
                                "\nCancer will either eat too much or nothing at all when they feel depressed causing an imbalance in their solar plexus Chakra.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Leo":
                        astro_sign = "Leo sign is associated with heart, back, spine and blood. The heart chakra and the Root chakra energetically." +
                                "\nLeos could often have challenges with BP and could have heart problems." +
                                "\nIt is also important for them to keep their fire element in check as that could cause heart palpitations challenges.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Virgo":
                        astro_sign = "Virgo ruled by Mercury is associated with our abdomen and intestines . And energetically our solar plexus chakra." +
                                "\nVirgos can at times have challenges with the digestive system and eating habits." +
                                "\nThey could happen to have challenges with your bowls as well hence it is very important for Virgo’s to have a healthy diet but not obsess over it , balance is key.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Libra":
                        astro_sign = "Libra sign is associated with kidneys, adrenal glands and our skin. " +
                                "\nEnergetically our solar plexus chakra and sacral chakra being ruled by Venus." +
                                "\nLibrans could have sensitive skin and it’s important for them to stay hydrated and moisturized." +
                                "\nLibra needs to have a good diet as they could have stomach issues as well not only because of their diet " +
                                "\nbut because of their indecisiveness which creates an imbalance in their solar plexus chakra.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Scorpio":
                        astro_sign = "Scorpio is associated with ones bladder, rectum, genitals, ovaries and testes. Energetically it’s associated with sacral chakra and root chakra." +
                                "\nA Scorpio can be prone to sexually transmitted diseases if they’re not careful. Challenges like bladder infections, UTI and PCOS can be found in female Scorpios.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Sagittarius":
                        astro_sign = "Sagittarius is associated with our hips, thighs, sciatic nerves, and vision . Energetically third eye and sacral chakra." +
                                "\nSagittarius can have challenges related to Eyes and it’s important for them to have a proper treatment for the same as and impaired vision can also make them prone to accidents.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Capricorn":
                        astro_sign = "Capricorn is associated with bones, knees, teeth, skin and joints. Energetically root chakra." +
                                "\nCapricorn’s can be prone to fractures and should be careful if they’re into sports or while any activity that could break their bones or ligaments.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Aquarius":
                        astro_sign = "Aquarius is associated with lower legs, ankles and blood circulation. Energetically Root chakra." +
                                "\nAn Aquarius could have challenges like varicose veins and must give their legs a good massage every now and then." +
                                "\nThey could also twist their ankles causing them pain. An Aquarius should get foot acupuncture massages as that would help them in many ways.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    case "Pisces":
                        astro_sign = "Pisces is associated with our nervous system, feet and thalamus. Energetically our root chakra, solar plexus chakra and third eye." +
                                "\nWorry can cause challenges in the immune systems of Pisces. Hence it’s important for a Pisces to practice breath work as that would also help them improve their immune system." +
                                "\nPPisces, are likely to have corns, bunions, and athlete’s foot. If you don’t have these conditions at present or in the past , there is a possibility in that you could have them in the future.";
                        System.out.println(astro_sign);
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        break;
                    default:
                        System.err.println("Invalid  Entry");
                        System.out.println();
                        System.out.println();
                        logo();
                        System.out.println();
                        goodbyeMessage();
                        System.exit(0);
                }
            }
        }
        scan.close();
    }


}
