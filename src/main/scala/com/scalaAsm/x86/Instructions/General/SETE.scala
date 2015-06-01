package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - zero/equal (ZF=0)
// Category: general/datamov

trait SETE extends InstructionDefinition {
  val mnemonic = "SETE"
}

object SETE extends OneOperand[SETE] with SETEImpl

trait SETEImpl extends SETE {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x94) /+ 0
    val format = RmFormat
  }
}
