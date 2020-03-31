package com.wolfx.designpattern.template;

/**
 * @description: 制作豆浆的抽象类
 * @author: sukang
 * @date: 2020-03-31 9:35
 */
public abstract class MakeMilk {
    /**
     * @description: 制作豆浆的模板方法，一般会设置为final，防止之类去修改这个流程
     * @param
     * @return: void
     * @author: sukang
     * @date: 2020/3/31 9:45
     */
    final void make(){
        select();
        if(isAdd()){
            add();
        }
        soak();
        beat();
    }

    /**
     * @description: 选材方法
     * @param
     * @return: void
     * @author: sukang
     * @date: 2020/3/31 9:44
     */
    void select(){
        System.out.println("第一步：选择大豆...");
    }

    /**
     * @description: 添加配料，因为每种豆浆不同，所以配料也不一样
     * @param
     * @return: void
     * @author: sukang
     * @date: 2020/3/31 9:44
     */
    abstract void add();

    /**
     * @description: 浸泡
     * @param
     * @return: void
     * @author: sukang
     * @date: 2020/3/31 9:53
     */
    void soak(){
        System.out.println("第三步：浸泡...");
    }

    /**
     * @description: 豆浆机打碎
     * @param
     * @return: void
     * @author: sukang
     * @date: 2020/3/31 9:56
     */
    void beat(){
        System.out.println("第四步：豆浆机打碎...");
    }

    /**
     * @description: 钩子方法，决定是否需要添加配料
     * @param
     * @return: boolean
     * @author: sukang
     * @date: 2020/3/31 12:43
     */
    boolean isAdd(){
        return true;
    }

}
