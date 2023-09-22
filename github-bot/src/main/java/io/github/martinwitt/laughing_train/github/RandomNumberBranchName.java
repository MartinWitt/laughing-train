package io.github.martinwitt.laughing_train.github;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.Random;

/** RandomNumberBranchName */
@ApplicationScoped
public class RandomNumberBranchName implements BranchNameSupplier {

  private final Random random;

  public RandomNumberBranchName() {
    random = new Random();
  }

  @Override
  public String createBranchName() {
    return "laughing-train/Qodana/" + random.nextInt();
  }
}
