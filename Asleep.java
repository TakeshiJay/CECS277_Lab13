/** Asleep method is our default which tests that the puppy needs food
 */
public class Asleep implements PuppyState{
    /**play is the puppies action that takes place 
     * @param p is the puppy object that will be our used character
     */  
    public void play( Puppy p ){
        System.out.println("The puppy is asleep. It doesn't want to play right now.");
    }

    /** feed is our puppies way of eating
     * @param p is the puppy object that will be our used character
     */
    public void feed( Puppy p ){
        System.out.println("The puppy wakes up and comes ruinning to eat");
        p.setState(new Eating());
        p.incrementFeed();
    }
}