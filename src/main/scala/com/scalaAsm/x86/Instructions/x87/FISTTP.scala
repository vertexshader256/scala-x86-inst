package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store Integer with Truncation and Pop
// Category: general/conver

trait FISTTP extends InstructionDefinition {
  val mnemonic = "FISTTP"
}

object FISTTP extends OneOperand[FISTTP] with FISTTPImpl

trait FISTTPImpl extends FISTTP {
  implicit object FISTTP_0 extends _1[m32] {
    val opcode: OneOpcode = 0xDB /+ 1
    val format = RmFormat
    override def hasImplicitOperand = true
  }

  implicit object FISTTP_1 extends _1[m16] {
    val opcode: OneOpcode = 0xDF /+ 1
    val format = RmFormat
    override def hasImplicitOperand = true
  }
}
