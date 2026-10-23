package ru.starbank.teamwork.rules;

import ru.starbank.teamwork.dto.RecommendationDto;

import java.util.Optional;
import java.util.UUID;

public interface RecommendationRuleSet {

    Optional<RecommendationDto> check(UUID userId);
}