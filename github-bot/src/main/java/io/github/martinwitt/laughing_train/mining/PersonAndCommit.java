package io.github.martinwitt.laughing_train.mining;

import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.revwalk.RevCommit;

public record PersonAndCommit(PersonIdent person, RevCommit commit) {}
