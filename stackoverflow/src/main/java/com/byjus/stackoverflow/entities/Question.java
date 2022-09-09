package com.byjus.stackoverflow.entities;

import java.util.Map;
import java.util.UUID;

import lombok.Getter;

@Getter
public class Question implements UpVotable, Flaggable {
    
    private UUID id; -> key

    private UUID userId; -> index

    private String content; -> text

    private QuestionStatus status;

    private int upVotes;

    Map<UUID, Comment> comments; (join)
    Map<UUID, Answers> answers; (join)

    Set<String> tags; (text)

    public void upVote()
    {
        upVotes++;
    }

    public int getUpVotes()
    {
        return upVotes;
    }
}
