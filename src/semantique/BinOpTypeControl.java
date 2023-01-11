package semantique;

import ast.*;
import tds.*;

import java.util.ArrayList;

public class BinOpTypeControl extends Control{
    
    public BinOpTypeControl( Ast ast, Tds tds, ArrayList<Tds> tdsList) {
        super(ast, tds, tdsList);
    }

    @Override
    public int control() {
        int nb_error = 0;
        if (this.ast instanceof SupNode){
            if (((SupNode)this.ast).left instanceof Lvalue){
                String type_left = getType(((SupNode) this.ast).left);
                String type_right = getType(((SupNode) this.ast).right);

                if (type_right != null && type_left != null){
                    if (!type_right.equals("int") || !type_right.equals("String") || !type_left.equals("int") || !type_left.equals("String")){
                        if (!type_right.equals(type_left)){
                            nb_error++;
                            System.out.println("Error: SupNode must have two operands of the same type");
                        }
                    }
                }
            }
        }

        if (this.ast instanceof InfNode){
            if (((InfNode)this.ast).left instanceof Lvalue){
                String type_left = getType(((InfNode) this.ast).left);
                String type_right = getType(((InfNode) this.ast).right);

                if (type_right != null && type_left != null){
                    if (!type_right.equals("int") || !type_right.equals("String") || !type_left.equals("int") || !type_left.equals("String")){
                        if (!type_right.equals(type_left)){
                            nb_error++;
                            System.out.println("Error: InfNode must have two operands of the same type");
                        }
                    }
                }
            }

        }

        if (this.ast instanceof SupEqNode){
            if (((SupEqNode)this.ast).left instanceof Lvalue){
                String type_left = getType(((SupEqNode) this.ast).left);
                String type_right = getType(((SupEqNode) this.ast).right);

                if (type_right != null && type_left != null){
                    if (!type_right.equals("int") || !type_right.equals("String") || !type_left.equals("int") || !type_left.equals("String")){
                        if (!type_right.equals(type_left)){
                            nb_error++;
                            System.out.println("Error: SupEqNode must have two operands of the same type");
                        }
                    }
                }
            }
        }

        if (this.ast instanceof InfEqNode){
            if (((InfEqNode)this.ast).left instanceof Lvalue){
                String type_left = getType(((InfEqNode) this.ast).left);
                String type_right = getType(((InfEqNode) this.ast).right);

                if (type_right != null && type_left != null){
                    if (!type_right.equals("int") || !type_right.equals("String") || !type_left.equals("int") || !type_left.equals("String")){
                        if (!type_right.equals(type_left)){
                            nb_error++;
                            System.out.println("Error: InfEqNode must have two operands of the same type");
                        }
                    }
                }
            }
        }

        if (this.ast instanceof EqNode){
            if (((EqNode)this.ast).left instanceof Lvalue){
                String type_left = getType(((EqNode) this.ast).left);
                String type_right = getType(((EqNode) this.ast).right);

                if (type_right != null && type_left != null){
                    if (!type_right.equals("int") || !type_right.equals("String") || !type_left.equals("int") || !type_left.equals("String")){
                        if (!type_right.equals(type_left)){
                            nb_error++;
                            System.out.println("Error: EqNode must have two operands of the same type");
                        }
                    }
                }
            }
        }

        if (this.ast instanceof DiffNode){
            
            if (((DiffNode)this.ast).left instanceof Lvalue){
                String type_left = getType(((DiffNode) this.ast).left);
                String type_right = getType(((DiffNode) this.ast).right);

                if (type_right != null && type_left != null){
                    if (!type_right.equals("int") || !type_right.equals("String") || !type_left.equals("int") || !type_left.equals("String")){
                        if (!type_right.equals(type_left)){
                            nb_error++;
                            System.out.println("Error: DiffNode must have two operands of the same type");
                        }
                    }
                }
            }
 
        }

        if (this.ast instanceof AndNode){
            if (((AndNode)this.ast).left instanceof Lvalue){
                String type_left = getType(((AndNode) this.ast).left);
                String type_right = getType(((AndNode) this.ast).right);

                if (type_right != null && type_left != null){
                    if (!type_right.equals("boolean") || !type_left.equals("boolean")){
                        if (!type_right.equals(type_left)){
                            nb_error++;
                            System.out.println("Error: AndNode must have two operands of the type boolean");
                        }
                    }
                }
            }
        }

        if (this.ast instanceof OrNode){
            if (((OrNode)this.ast).left instanceof Lvalue){
                String type_left = getType(((OrNode) this.ast).left);
                String type_right = getType(((OrNode) this.ast).right);

                if (type_right != null && type_left != null){
                    if (!type_right.equals("boolean") || !type_left.equals("boolean")){
                        if (!type_right.equals(type_left)){
                            nb_error++;
                            System.out.println("Error: OrNode must have two operands of the type boolean");
                        }
                    }
                }
            }
        }

        if (this.ast instanceof Plus){
            if (((Plus)this.ast).left instanceof Lvalue){
                String type_left = getType(((Plus) this.ast).left);
                String type_right = getType(((Plus) this.ast).right);

                if (type_right != null && type_left != null){
                    if (!type_right.equals("int") || !type_right.equals("String") || !type_left.equals("int") || !type_left.equals("String")){
                        if (!type_right.equals(type_left)){
                            nb_error++;
                            System.out.println("Error: Plus must have two operands of the same type");
                        }
                    }
                }
            }
        }

        if (this.ast instanceof Minus){
            if (((Minus)this.ast).left instanceof Lvalue){
                String type_left = getType(((Minus) this.ast).left);
                String type_right = getType(((Minus) this.ast).right);

                if (type_right != null && type_left != null){
                    if (!type_right.equals("int") || !type_right.equals("String") || !type_left.equals("int") || !type_left.equals("String")){
                        if (!type_right.equals(type_left)){
                            nb_error++;
                            System.out.println("Error: Minus must have two operands of the same type");
                        }
                    }
                }
            }
        }

        if (this.ast instanceof Mult){
            if (((Mult)this.ast).left instanceof Lvalue){
                String type_left = getType(((Mult) this.ast).left);
                String type_right = getType(((Mult) this.ast).right);

                if (type_right != null && type_left != null){
                    if (!type_right.equals("int") || !type_right.equals("String") || !type_left.equals("int") || !type_left.equals("String")){
                        if (!type_right.equals(type_left)){
                            nb_error++;
                            System.out.println("Error: Mult must have two operands of the same type");
                        }
                    }
                }
            }
        }

        if (this.ast instanceof Div){
            if (((Div)this.ast).left instanceof Lvalue){
                String type_left = getType(((Div) this.ast).left);
                String type_right = getType(((Div) this.ast).right);

                if (type_right != null && type_left != null){
                    if (!type_right.equals("int") || !type_right.equals("String") || !type_left.equals("int") || !type_left.equals("String")){
                        if (!type_right.equals(type_left)){
                            nb_error++;
                            System.out.println("Error: Div must have two operands of the same type");
                        }
                    }
                }
            }
        }

        return nb_error;
    }
}
