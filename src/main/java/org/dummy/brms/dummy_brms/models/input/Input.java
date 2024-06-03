package org.dummy.brms.dummy_brms.models.input;

import java.util.List;

import org.dummy.brms.dummy_brms.models.input.facts.Fact;

import lombok.Data;

@Data
public class Input {

    private List<Rule> rules;
    private List<Fact> facts;
}
