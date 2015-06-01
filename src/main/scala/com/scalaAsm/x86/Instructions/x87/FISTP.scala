package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store Integer and Pop
// Category: general/datamov

trait FISTP extends InstructionDefinition {
  val mnemonic = "FISTP"
}

object FISTP extends OneOperand[FISTP] with FISTPImpl

trait FISTPImpl extends FISTP {
  implicit object FISTP_0 extends _1[m32] {
    val opcode: OneOpcode = 0xDB /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object FISTP_1 extends _1[m16] {
    val opcode: OneOpcode = 0xDF /+ 3
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
