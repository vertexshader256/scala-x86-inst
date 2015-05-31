package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not below or equal/above (CF=0 AND ZF=0)
// Category: general/datamov

trait SETA extends InstructionDefinition {
  val mnemonic = "SETA"
}

object SETA extends OneOperand[SETA] with SETAImpl

trait SETAImpl extends SETA {
  implicit object SETA_0 extends _1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x97) /+ 0
    val format = RmFormat
    val hasRMByte = true
  }
}
