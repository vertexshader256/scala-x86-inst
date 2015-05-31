package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Unsigned Divide
// Category: general/arith/binary

trait DIV extends InstructionDefinition {
  val mnemonic = "DIV"
}

object DIV extends OneOperand[DIV] with DIVImpl

trait DIVImpl extends DIV {
  implicit object DIV_0 extends _1[rm8] {
    val opcode: OneOpcode = 0xF6 /+ 6
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object DIV_1 extends _1[rm16] {
    val opcode: OneOpcode = 0xF7 /+ 6
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object DIV_2 extends _1[rm32] {
    val opcode: OneOpcode = 0xF7 /+ 6
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object DIV_3 extends _1[rm64] {
    val opcode: OneOpcode = 0xF7 /+ 6
    override def prefix = REX.W(true)
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }
}
