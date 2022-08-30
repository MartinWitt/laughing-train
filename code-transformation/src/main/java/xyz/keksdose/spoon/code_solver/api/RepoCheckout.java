package xyz.keksdose.spoon.code_solver.api;

import java.io.File;
import javax.annotation.Nonnull;

public interface RepoCheckout {

    /**
     * Checks out the given repository and returns the path to the checked out repo
     * @return  the path to the checked out repo.
     */
    @Nonnull
    File prepareRepo();
}
