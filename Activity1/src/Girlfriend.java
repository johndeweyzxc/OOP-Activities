import java.io.BufferedReader;
import java.io.InputStreamReader;

class newGirlfriend {
    public String height;
    public String weight;
    public String facialFeatures;
    public String skinColor;

    // Outputs the final result of a girlfriend you want.
    private void outputGirlfriend(String name) {
        System.out.println(name + " is your new girlfriend, her weight is " + weight + ", her height is "
                + height + ", her facial features is " + facialFeatures + ", and her skin color is " + skinColor);
    }

    // If you want a default short haired chinita.
    public void ShortHairedChinita(String name) {
        height = "5'3";
        weight = "60kg";
        facialFeatures = "Cute Chinita";
        skinColor = "Fair skin";
        outputGirlfriend(name);
    }

    // You can also customize what type of girlfriend you want.
    public void CustomizeGirlfriend(String name) {
        if (height == null || weight == null || facialFeatures == null || skinColor == null) {
            System.out
                    .println("You must defined the height, weight, facial features and skin color of your girlfriend.");
            return;
        }

        outputGirlfriend(name);
    }
}

public class Girlfriend {
    public static void main(String[] args) throws Exception {
        String girlfriendName;
        int customizeOrNot;

        newGirlfriend girlfriend = new newGirlfriend();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to Girlfriend.create.com, You can select or customize the girlfriend you want");
        System.out.print("Enter her name: ");
        girlfriendName = bufferedReader.readLine();

        System.out.println(
                "Do you want a default short haired chinita or customize your own? [0] - Default [1] - Customize");
        customizeOrNot = Integer.parseInt(bufferedReader.readLine());

        if (customizeOrNot == 0) {
            girlfriend.ShortHairedChinita(girlfriendName);
        } else if (customizeOrNot == 1) {
            System.out.print("Enter her height: ");
            girlfriend.height = bufferedReader.readLine();
            System.out.print("Enter her weight: ");
            girlfriend.weight = bufferedReader.readLine();
            System.out.print("Enter her facial features: ");
            girlfriend.facialFeatures = bufferedReader.readLine();
            System.out.print("Enter her skin color: ");
            girlfriend.skinColor = bufferedReader.readLine();

            // Create the result
            girlfriend.CustomizeGirlfriend(girlfriendName);
        }
    }
}
