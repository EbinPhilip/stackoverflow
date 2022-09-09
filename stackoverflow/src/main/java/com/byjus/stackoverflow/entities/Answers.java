package com.byjus.stackoverflow.entities;

import java.util.UUID;

import lombok.Getter;


/*
 * Text id primary key
 * Text questionId (indexed)
 * Text parentId (indexed)
 * Test userId (indexed)
 * int upvotes
 */

@Getter
public class Answers implements UpVotable {

    private UUID id;

    private UUID questionID; -> foreign key

    private UUID userId;

    private int upVotes;

    public void upVote()
    {
        upVotes++;
    }

    public int getUpVotes()
    {
        return upVotes;
    }
}
