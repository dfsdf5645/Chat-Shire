package com.ssafy.backend.domain.user.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.backend.domain.analyze.Statistic;
import com.ssafy.backend.domain.common.exception.ResourceNotFoundException;
import com.ssafy.backend.domain.user.Challenge;
import com.ssafy.backend.domain.user.repository.ChallengeRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class ChallengeService {

	// 도전과제 12개
	//프로젝트 5 / 10 / 25 - 플젝생성, 플젝가입
	//커밋 개수 100 / 500 / 1000 -
	//채팅 개수 1000 / 5000 / 10000 - 채팅 스케쥴러
	// 태스크 생성 개수 50 / 300 / 500 - 태스크 등록
	// 에러 게시판 글 생성 50 / 100 / 300 - 에러게시판 등록
	// 에러 해결 50 / 100 / 150 -
	//사진, 링크 공유 개수 100 / 300 / 500 - 채팅 post 첨부파일 검증
	// 자료공유 생성 개수 50 / 100 / 500
	// 스낵바 알림 보낸 횟수 50 / 100 / 300
	//동시에 진행한 프로젝트 개수 3 / 5 / 7
	// 최장 연속 접속 일수 7 / 30 / 365
	//도전과제 달성 11 / 23 / 35

	private final ChallengeRepository challengeRepository;


	public void addProject(Long userId) {
		Challenge challenge = challengeRepository.findByUserId(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Challenge.user", userId));
		challenge.addProject();
	}
	public void updateMyCommit(String githubId, Long commitCount) {
		Challenge challenge = challengeRepository.findByUserGithubId(githubId)
				.orElseThrow(() -> new ResourceNotFoundException("Challenge.user", githubId));

		challenge.updateCommit(commitCount);
	}
	public void addChat(Long userId, int count) {
		Challenge challenge = challengeRepository.findByUserId(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Challenge.user", userId));
		challenge.addChat(count);
	}

	public void addTask(Long userId) {
		Challenge challenge = challengeRepository.findByUserId(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Challenge.user", userId));
		challenge.addTask();
	}

	public void addError(Long userId) {
		Challenge challenge = challengeRepository.findByUserId(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Challenge.user", userId));
		challenge.addError();
	}

	public void addSolution(Long userId) {
		Challenge challenge = challengeRepository.findByUserId(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Challenge.user", userId));
		challenge.addSolution();
	}

	public void addLink(Long userId) {
		Challenge challenge = challengeRepository.findByUserId(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Challenge.user", userId));
		challenge.addLink();
	}

	public void addData(Long userId) {
		Challenge challenge = challengeRepository.findByUserId(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Challenge.user", userId));
		challenge.addData();
	}
	public void addSnackbar(Long userId) {
		Challenge challenge = challengeRepository.findByUserId(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Challenge.user", userId));
		challenge.addSnackbar();
	}

	public void addOngoing(Long userId) {
		Challenge challenge = challengeRepository.findByUserId(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Challenge.user", userId));
		challenge.addOngoing(11); // FIX
	}

	public void addLogin(Long userId) {
		Challenge challenge = challengeRepository.findByUserId(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Challenge.user", userId));
		challenge.addLogin();
	}

	public void addDone(Long userId) {
		Challenge challenge = challengeRepository.findByUserId(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Challenge.user", userId));
		challenge.addDone();
	}










}
