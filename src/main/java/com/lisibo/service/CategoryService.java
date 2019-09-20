package com.lisibo.service;

import java.util.List;

import com.lisibo.entity.Category;

public interface CategoryService {

	List<Category> getCategoryByChId(Integer cid);

}
