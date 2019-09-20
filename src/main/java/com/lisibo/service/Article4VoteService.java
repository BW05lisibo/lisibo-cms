package com.lisibo.service;

import java.util.List;

import com.lisibo.entity.Article4Vote;
import com.lisibo.entity.VoteStatic;

/**
 * 
 * @author lisibo
 *
 */
public interface Article4VoteService {
	
	int publish(Article4Vote av);
	
	List<Article4Vote>  list();
	
	Article4Vote  findById(Integer id);
	
	int vote(Integer userId, Integer articleId,Character option);
	
	List<VoteStatic> getVoteStatics(Integer articleId);
	
	
	

}
