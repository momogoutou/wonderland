package net.wingsby.player;

import net.wingsby.skill.Skill;

import java.util.List;
import java.util.Map;

/**
 * Created by wingsby on 2018/5/28.
 */
public class Player {
    private  String name;
    private  int age;
    private  Map<String,Player> relation;
    private  String org;

//    战斗
    private float bodyVal;
    private float power;
    //
    private List<Skill> skillList;
    //特殊属性
    private Map<String,SpeicalProperties>speicalProperties;


    class status{

    }

    public boolean moveTo(String map){

    }

}
