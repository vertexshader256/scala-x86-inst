package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not below/above or equal/not carry (CF=0)
// Category: general/datamov

trait SETNC extends InstructionDefinition {
  val mnemonic = "SETNC"
}

object SETNC extends OneOperand[SETNC] with SETNCImpl

trait SETNCImpl extends SETNC {
  implicit object _0 extends OneOp[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x93) /+ 0
    val format = RmFormat
  }
}
