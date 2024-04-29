package com.example.demo.batch;

import org.springframework.batch.item.ItemProcessor;

import com.example.demo.model.Category;

public class CategoryProcessor implements ItemProcessor<Category,Category> {

    @Override
    public Category process(Category category) throws Exception {
        if(category.getTitle()!=null) {
            return category;
        }else{
            return null;
        }
    }


}
