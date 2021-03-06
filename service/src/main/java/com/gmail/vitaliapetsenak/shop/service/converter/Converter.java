package com.gmail.vitaliapetsenak.shop.service.converter;

import com.gmail.vitaliapetsenak.shop.repository.model.*;
import com.gmail.vitaliapetsenak.shop.service.model.*;

public class Converter {
    public static void convert(UserDTO userDTO, User user) {
        if (userDTO.getLogin() != null) {
            user.setLogin(userDTO.getLogin());
        }
        if (userDTO.getPassword() != null) {
            user.setPassword(userDTO.getPassword());
        }
        if (userDTO.getStatus() != null) {
            user.setStatus(userDTO.getStatus().getStatus());
        }
        if (userDTO.getRole() != null) {
            user.setRole(userDTO.getRole().getRole());
        }
        if (userDTO.getFirstName() != null) {
            user.setFirstName(userDTO.getFirstName());
        }
        if (userDTO.getSurname() != null) {
            user.setSurname(userDTO.getSurname());
        }
        if (userDTO.getBirthDate() != null) {
            user.setBirthDate(userDTO.getBirthDate());
        }
        if (userDTO.getPhone() != null) {
            user.setPhone(userDTO.getPhone());
        }
        if (userDTO.getCountry() != null) {
            user.setCountry(userDTO.getCountry());
        }
        if (userDTO.getCity() != null) {
            user.setCity(userDTO.getCity());
        }
        if (userDTO.getStreet() != null) {
            user.setStreet(userDTO.getStreet());
        }
        if (userDTO.getHouse() != null) {
            user.setHouse(userDTO.getHouse());
        }
        if (userDTO.getBlock() != null) {
            user.setBlock(userDTO.getBlock());
        }
        if (userDTO.getApartment() != null) {
            user.setApartment(userDTO.getApartment());
        }
    }

    public static void convert(GoodsDTO goodsDTO, Goods goods) {
        if (goodsDTO.getName() != null) {
            goods.setName(goodsDTO.getName());
        }
        if (goodsDTO.getDescription() != null) {
            goods.setDescription(goodsDTO.getDescription());
        }
        if (goodsDTO.getCategory() != null) {
            goods.setCategory(goodsDTO.getCategory().getCategory());
        }
        if (goodsDTO.getCount() != null) {
            goods.setCount(goodsDTO.getCount());
        }
        if (goodsDTO.getPrice() != null) {
            goods.setPrice(goodsDTO.getPrice());
        }
        if (goodsDTO.getIsDeleted() != null) {
            goods.setIsDeleted(goodsDTO.getIsDeleted().getIsDeleted());
        }
    }

    public static void convert(NewsDTO newsDTO, News news) {
        if (newsDTO.getUser() != null) {
            news.setUser(getUser(newsDTO.getUser()));
        }
        if (newsDTO.getAuthor() != null) {
            news.setAuthor(newsDTO.getAuthor());
        }
        if (newsDTO.getName() != null) {
            news.setName(newsDTO.getName());
        }
        if (newsDTO.getDescription() != null) {
            news.setDescription(newsDTO.getDescription());
        }
        if (newsDTO.getTimestamp() != null) {
            news.setTimestamp(newsDTO.getTimestamp());
        }
        if (newsDTO.getImage() != null) {
            news.setImage(newsDTO.getImage());
        }
    }

    private static User getUser(UserDTO userDTO) {
        User user = User.newBuilder().build();
        user.setId(userDTO.getId());
        convert(userDTO, user);
        return user;
    }

    public static void convert(PurchasesDTO purchasesDTO, Purchases purchases) {
        if (purchasesDTO.getGoods() != null) {
            Goods goods = Goods.newBuilder().build();
            goods.setId(purchasesDTO.getGoods().getId());
            convert(purchasesDTO.getGoods(), goods);
            purchases.setGoods(goods);
        }
        if (purchasesDTO.getCount() != null) {
            purchases.setCount(purchasesDTO.getCount());
        }
        if (purchasesDTO.getUser() != null) {
            purchases.setUser(getUser(purchasesDTO.getUser()));
        }
        if (purchasesDTO.getTimestamp() != null) {
            purchases.setTimestamp(purchasesDTO.getTimestamp());
        }
        if (purchasesDTO.getStatus() != null) {
            purchases.setStatus(purchasesDTO.getStatus().getStatus());
        }
        if (purchasesDTO.getAmount() != null) {
            purchases.setAmount(purchasesDTO.getAmount());
        }
    }

    public static void convert(CommentDTO commentDTO, Comment comment) {
        if (commentDTO.getText() != null) {
            comment.setText(commentDTO.getText());
        }
        if (commentDTO.getUser() != null) {
            comment.setUser(getUser(commentDTO.getUser()));
        }
        if (commentDTO.getNews() != null) {
            News news = News.newBuilder().build();
            news.setId(commentDTO.getNews().getId());
            convert(commentDTO.getNews(), news);
            comment.setNews(news);
        }
        if (commentDTO.getDate() != null) {
            comment.setDate(commentDTO.getDate());
        }
    }
}
