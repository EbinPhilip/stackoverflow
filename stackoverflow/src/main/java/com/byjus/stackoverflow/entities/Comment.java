package com.byjus.stackoverflow.entities;

import java.util.UUID;

import lombok.Getter;

/*
 * Text id -> primary key
 * Text parentId (indexed)
 * int parentType
 * Text content
 * int upVotes
 */

@Getter
public class Comment implements UpVotable {

    public enum Type {
        question,
        answer
    }

    private UUID id; -> key

    private UUID parentId; -> index

    private UUID userId; -> foreign key

    private String content;

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
