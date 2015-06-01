package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not below or equal/above (CF=0 AND ZF=0)
// Category: general/datamov

trait SETNBE extends InstructionDefinition {
  val mnemonic = "SETNBE"
}

object SETNBE extends OneOperand[SETNBE] with SETNBEImpl

trait SETNBEImpl extends SETNBE {
  implicit object SETNBE_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x97) /+ 0
    val format = RmFormat
  }
}
