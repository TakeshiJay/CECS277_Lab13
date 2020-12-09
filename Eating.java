/**Eating is the current state of the puppy eating while testing if it ate too much*/
public class Eating implements PuppyState {
    /**play is the puppies action that takes place where it chases the ball
     * @param p is the puppy object that will be our used character
     */
    public void play(Puppy p){
        System.out.println("The puppy looks up from its food and chases the ball you threw");
        p.setState(new Playing());
        p.incrementPlay();
    }

    /** feed is our puppies way of eating and uses a max of 3 
     * to ensure that the puppy doesnt eat too much
     * @param p is the puppy object that will be our used character
     */
    public void feed(Puppy p){
        int feedMax = 3; 
        p.incrementFeed();

        System.out.println("The puppy continues to eat as you add another scoop of kibble to its bowl");
        if(p.getFeed() == feedMax){
            System.out.println("The puppy ate so much and fell asleep!");
        }
    }
}
